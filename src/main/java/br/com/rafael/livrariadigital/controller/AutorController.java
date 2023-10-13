package br.com.rafael.livrariadigital.controller;

import br.com.rafael.livrariadigital.model.Autor;
import br.com.rafael.livrariadigital.service.AutorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
    private final AutorService autorService;

    @Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public ResponseEntity<List<Autor>> buscarTodosAutores() {
        return ResponseEntity.ok(autorService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> buscarAutorPorId(@PathVariable UUID id) {
        Autor autor = autorService.buscarPorId(id);
        if (autor != null) {
            return ResponseEntity.ok(autor);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Autor> salvarAutor(@Valid @RequestBody Autor autor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(autorService.salvar(autor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> atualizarAutor(@PathVariable UUID id, @Valid @RequestBody Autor autor) {
        Autor autorAtualizado = autorService.atualizar(id, autor);
        if (autorAtualizado != null) {
            return ResponseEntity.ok(autorAtualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirAutor(@PathVariable UUID id) {
        autorService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
