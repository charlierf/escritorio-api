package com.adv.escritorio.controller;

import com.adv.escritorio.model.Pessoa;
import com.adv.escritorio.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pessoa>> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Pessoa> create(@RequestBody Pessoa Pessoa){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.save(Pessoa));
    }

    @PutMapping
    public ResponseEntity<Pessoa> update(@RequestBody Pessoa Pessoa){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.update(Pessoa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        pessoaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
