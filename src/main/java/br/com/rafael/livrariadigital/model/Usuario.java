package br.com.rafael.livrariadigital.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    @NotBlank(message = "O nome do usuário é obrigatório")
    private String nome;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "O email do usuário é obrigatório")
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}", message = "O email deve estar no formato adequado")
    private String email;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "O telefone do usuário é obrigatório")
    @Pattern(regexp = "\\([0-9]{2}\\) [0-9]{4,5}-[0-9]{4}", message = "O telefone deve estar no formato (99) 99999-9999")
    private String telefone;

    @Column(nullable = false)
    @NotBlank(message = "A senha do usuário é obrigatória")
    @Size(min = 8, message = "A senha deve conter pelo menos 8 caracteres (excluindo espaços em branco)")
    @Pattern(regexp = "^\\S{8,}$", message = "A senha não pode conter espaços em branco")
    private String senha;
}
