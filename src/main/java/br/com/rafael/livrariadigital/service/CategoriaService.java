package br.com.rafael.livrariadigital.service;

import br.com.rafael.livrariadigital.model.Categoria;
import br.com.rafael.livrariadigital.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarPorId(UUID id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void excluir(UUID id) {
        categoriaRepository.deleteById(id);
    }

    public Categoria atualizar(UUID id, Categoria categoria) {
        Categoria categoriaAtual = categoriaRepository.findById(id).orElse(null);
        if (categoriaAtual != null) {
            categoriaAtual.setNome(categoria.getNome());
            return categoriaRepository.save(categoriaAtual);
        }
        return null;
    }
}
