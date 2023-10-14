package br.com.rafael.livrariadigital.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    @NotBlank(message = "O título do livro é obrigatório")
    private String titulo;

    @ManyToOne
    @JoinColumn(nullable = false, name = "autor_id")
    @NotNull(message = "O autor do livro é obrigatório")
    private Autor autor;

    @Column(nullable = false)
    @NotBlank(message = "A descrição curta do livro é obrigatória")
    private String descricaoCurta;

    @Column(nullable = false, length = 10000)
    @NotBlank(message = "A descrição longa do livro é obrigatória")
    private String descricaoLonga;

    @Column(nullable = false, length = 1500)
    @NotBlank(message = "A URL da capa do livro é obrigatória")
    private String urlCapa;

    @Column(nullable = false)
    @NotNull(message = "O preço do livro é obrigatório")
    @Min(value = 0, message = "O preço do livro deve ser maior ou igual a 0")
    private Double preco;

    @ManyToOne
    @NotNull(message = "A categoria do livro é obrigatória")
    private Categoria categoria;

    @Column(nullable = false)
    @NotNull(message = "A quantidade de páginas do livro é obrigatória")
    @Min(value = 1, message = "A quantidade de páginas do livro deve ser maior que 0")
    private Integer quantidadePaginas;

    @Column(nullable = false)
    @NotNull(message = "O ano de publicação do livro é obrigatório")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date anoPublicacao;
}
