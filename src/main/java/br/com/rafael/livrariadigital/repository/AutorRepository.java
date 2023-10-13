package br.com.rafael.livrariadigital.repository;

import br.com.rafael.livrariadigital.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
