package br.com.rafael.livrariadigital.service;

import br.com.rafael.livrariadigital.model.Livro;
import br.com.rafael.livrariadigital.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> buscarTodos() {
        return livroRepository.findAll();
    }

    public Livro buscarPorId(UUID id) {
        return livroRepository.findById(id).orElse(null);
    }

    public List<Livro> buscarPorPalavraChave(String busca) {
        List<Livro> livros = buscarTodos();

        return livros.stream()
                .filter(livro -> livro.getTitulo().toLowerCase().contains(busca.toLowerCase()) ||
                        livro.getDescricaoCurta().toLowerCase().contains(busca.toLowerCase()) ||
                        livro.getDescricaoLonga().toLowerCase().contains(busca.toLowerCase()) ||
                        livro.getAutor().getNome().toLowerCase().contains(busca.toLowerCase()) ||
                        livro.getCategoria().getNome().toLowerCase().contains(busca.toLowerCase()) ||
                        livro.getAnoPublicacao().toString().contains(busca) ||
                        livro.getPreco().toString().contains(busca) ||
                        livro.getQuantidadePaginas().toString().contains(busca))
                .collect(Collectors.toList());
    }

    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    public void excluir(UUID id) {
        livroRepository.deleteById(id);
    }

    public Livro atualizar(UUID id, Livro livro) {
        Livro livroAtual = livroRepository.findById(id).orElse(null);
        if (livroAtual != null) {
            livroAtual.setTitulo(livro.getTitulo());
            livroAtual.setDescricaoCurta(livro.getDescricaoCurta());
            livroAtual.setDescricaoLonga(livro.getDescricaoLonga());
            livroAtual.setUrlCapa(livro.getUrlCapa());
            livroAtual.setPreco(livro.getPreco());
            livroAtual.setAnoPublicacao(livro.getAnoPublicacao());
            livroAtual.setQuantidadePaginas(livro.getQuantidadePaginas());
            livroAtual.setCategoria(livro.getCategoria());
            livroAtual.setAutor(livro.getAutor());
            return livroRepository.save(livroAtual);
        }
        return null;
    }
}
