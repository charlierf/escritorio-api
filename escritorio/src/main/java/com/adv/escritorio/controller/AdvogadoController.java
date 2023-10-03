package com.adv.escritorio.controller;

import com.adv.escritorio.model.Advogado;
import com.adv.escritorio.service.AdvogadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/advogado")
public class AdvogadoController {

    @Autowired
    private AdvogadoService advogadoService;

    @GetMapping
    public ResponseEntity<List<Advogado>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(advogadoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Advogado>> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(advogadoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Advogado> create(@RequestBody Advogado advogado){
        return ResponseEntity.status(HttpStatus.CREATED).body(advogadoService.save(advogado));
    }

    @PutMapping
    public ResponseEntity<Advogado> update(@RequestBody Advogado advogado){
        return ResponseEntity.status(HttpStatus.OK).body(advogadoService.update(advogado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        advogadoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
