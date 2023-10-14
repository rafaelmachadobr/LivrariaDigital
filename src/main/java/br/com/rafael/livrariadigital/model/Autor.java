package br.com.rafael.livrariadigital.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    @NotBlank(message = "O nome do autor é obrigatório")
    private String nome;

    @Column(nullable = false)
    @NotNull(message = "A data de nascimento do autor é obrigatória")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataNascimento;

    @Column(nullable = false, length = 1500)
    @NotBlank(message = "A biografia do autor é obrigatória")
    private String biografia;

    @Column(nullable = false, length = 1500)
    @NotBlank(message = "A URL da foto do autor é obrigatória")
    private String urlFoto;

    @Column(nullable = false)
    @NotBlank(message = "A nacionalidade do autor é obrigatória")
    private String nacionalidade;
}
