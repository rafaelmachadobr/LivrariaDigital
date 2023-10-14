package br.com.rafael.livrariadigital.controller;

import br.com.rafael.livrariadigital.model.Livro;
import br.com.rafael.livrariadigital.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public ResponseEntity<List<Livro>> buscarTodosLivros() {
        return ResponseEntity.ok(livroService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarLivroPorId(@PathVariable UUID id) {
        Livro livro = livroService.buscarPorId(id);
        if (livro != null) {
            return ResponseEntity.ok(livro);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{busca}")
    public ResponseEntity<List<Livro>> buscarLivroPorPalavraChave(@PathVariable String busca) {
        return ResponseEntity.ok(livroService.buscarPorPalavraChave(busca));
    }

    @PostMapping
    public ResponseEntity<Livro> salvarLivro(@Valid @RequestBody Livro livro) {
        return ResponseEntity.ok(livroService.salvar(livro));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable UUID id, @Valid @RequestBody Livro livro) {
        Livro livroAtualizado = livroService.atualizar(id, livro);
        if (livroAtualizado != null) {
            return ResponseEntity.ok(livroAtualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirLivro(@PathVariable UUID id) {
        livroService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
