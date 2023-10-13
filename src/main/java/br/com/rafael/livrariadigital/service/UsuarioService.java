package br.com.rafael.livrariadigital.service;

import br.com.rafael.livrariadigital.model.Usuario;
import br.com.rafael.livrariadigital.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(UUID id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void excluir(UUID id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario atualizar(UUID id, Usuario usuario) {
        Usuario usuarioAtual = usuarioRepository.findById(id).orElse(null);
        if (usuarioAtual != null) {
            usuarioAtual.setNome(usuario.getNome());
            usuarioAtual.setEmail(usuario.getEmail());
            usuarioAtual.setSenha(usuario.getSenha());
            usuarioAtual.setTelefone(usuario.getTelefone());
            return usuarioRepository.save(usuarioAtual);
        }
        return null;
    }
}
