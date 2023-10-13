package br.com.rafael.livrariadigital.service;

import br.com.rafael.livrariadigital.model.Autor;
import br.com.rafael.livrariadigital.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    @Autowired
    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> buscarTodos() {
        return autorRepository.findAll();
    }

    public Autor buscarPorId(UUID id) {
        return autorRepository.findById(id).orElse(null);
    }

    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }

    public void excluir(UUID id) {
        autorRepository.deleteById(id);
    }

    public Autor atualizar(UUID id, Autor autor) {
        Autor autorAtual = autorRepository.findById(id).orElse(null);
        if (autorAtual != null) {
            autorAtual.setNome(autor.getNome());
            autorAtual.setDataNascimento(autor.getDataNascimento());
            autorAtual.setBiografia(autor.getBiografia());
            autorAtual.setUrlFoto(autor.getUrlFoto());
            autorAtual.setNacionalidade(autor.getNacionalidade());
            return autorRepository.save(autorAtual);
        }
        return null;
    }
}
