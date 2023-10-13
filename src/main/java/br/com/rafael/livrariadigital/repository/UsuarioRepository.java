package br.com.rafael.livrariadigital.repository;

import br.com.rafael.livrariadigital.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
