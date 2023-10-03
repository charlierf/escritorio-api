package com.adv.escritorio.controller;

import com.adv.escritorio.model.Advogado;
import com.adv.escritorio.model.Escritorio;
import com.adv.escritorio.service.AdvogadoService;
import com.adv.escritorio.service.EscritorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/escritorio")
public class EscritorioController {

    @Autowired
    private EscritorioService escritorioService;

    @GetMapping
    public ResponseEntity<List<Escritorio>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(escritorioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Escritorio>> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(escritorioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Escritorio> create(@RequestBody Escritorio escritorio){
        return ResponseEntity.status(HttpStatus.CREATED).body(escritorioService.save(escritorio));
    }

    @PutMapping
    public ResponseEntity<Escritorio> update(@RequestBody Escritorio escritorio){
        return ResponseEntity.status(HttpStatus.OK).body(escritorioService.update(escritorio));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        escritorioService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
