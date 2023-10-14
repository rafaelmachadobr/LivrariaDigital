package br.com.rafael.livrariadigital.repository;

import br.com.rafael.livrariadigital.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
