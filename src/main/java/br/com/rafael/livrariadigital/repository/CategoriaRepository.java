package br.com.rafael.livrariadigital.repository;

import br.com.rafael.livrariadigital.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {
}
