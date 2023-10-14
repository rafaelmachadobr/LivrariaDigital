package br.com.rafael.livrariadigital.repository;

import br.com.rafael.livrariadigital.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
