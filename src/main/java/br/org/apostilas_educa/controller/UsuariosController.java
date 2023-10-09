package br.org.apostilas_educa.controller;

import br.org.apostilas_educa.model.Usuarios;
import br.org.apostilas_educa.repository.UsuariosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping
    public ResponseEntity<List<Usuarios>> getAll() {
        return ResponseEntity.ok(usuariosRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> getById(@PathVariable Long id) {
        return usuariosRepository.findById(id)
                .map(response -> ResponseEntity.ok(response))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/email/")
    public ResponseEntity<Usuarios> getByEmail(@RequestBody @Valid String email) {
        return ResponseEntity.ok(usuariosRepository.findByEmailContainingIgnoreCase(email));

    }

    @PostMapping
    public ResponseEntity<Usuarios> createUser(@RequestBody @Valid Usuarios usuarios) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(usuariosRepository.save(usuarios));
    }

    @PutMapping
    public ResponseEntity<Usuarios> put(@Valid @RequestBody Usuarios usuarios){
        return usuariosRepository.findById(usuarios.getId())
                .map(response -> ResponseEntity.status(HttpStatus.OK)
                        .body(usuariosRepository.save(usuarios)))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Optional<Usuarios> usuarios = usuariosRepository.findById(id);

        if(usuarios.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        usuariosRepository.deleteById(id);
    }

}
