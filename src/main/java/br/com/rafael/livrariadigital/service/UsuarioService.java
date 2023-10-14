package br.com.rafael.livrariadigital.service;

import br.com.rafael.livrariadigital.handler.BusinessException;
import br.com.rafael.livrariadigital.model.Endereco;
import br.com.rafael.livrariadigital.model.Usuario;
import br.com.rafael.livrariadigital.repository.EnderecoRepository;
import br.com.rafael.livrariadigital.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final EnderecoRepository enderecoRepository;
    private final ViaCepService viaCepService;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository, EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
        this.usuarioRepository = usuarioRepository;
        this.enderecoRepository = enderecoRepository;
        this.viaCepService = viaCepService;
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(UUID id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario salvar(Usuario usuario) {
        salvarComCep(usuario);
        return usuario;
    }

    public void excluir(UUID id) {
        try {
            UUID uuid = UUID.fromString(id.toString());
            Usuario usuario = usuarioRepository.findById(uuid).orElse(null);
            if (usuario != null) {
                usuarioRepository.delete(usuario);
            } else {
                throw new BusinessException("Usuário não encontrado");
            }
        } catch (IllegalArgumentException e) {
            throw new BusinessException("ID de usuário inválido");
        }
    }

    public Usuario atualizar(UUID id, Usuario usuario) {
        Usuario usuarioAtual = usuarioRepository.findById(id).orElse(null);
        if (usuarioAtual != null) {
            usuarioAtual.setNome(usuario.getNome());
            usuarioAtual.setEmail(usuario.getEmail());
            usuarioAtual.setTelefone(usuario.getTelefone());
            usuarioAtual.setSenha(usuario.getSenha());
            usuarioAtual.setEndereco(usuario.getEndereco());

            salvarComCep(usuarioAtual);
            return usuarioAtual;
        }
        return null;
    }

    private void salvarComCep(Usuario usuario) {
        String cep = usuario.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            return enderecoRepository.save(novoEndereco);
        });
        usuario.setEndereco(endereco);
        usuarioRepository.save(usuario);
    }
}
