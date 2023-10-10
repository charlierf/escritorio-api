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
    public ResponseEntity<Pessoa> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Pessoa> create(@RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.save(pessoa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> update(@PathVariable String id, @RequestBody Pessoa pessoa){
        // Set the ID for the given Pessoa
        pessoa.setId(id);
        Pessoa updatedPessoa = pessoaService.update(pessoa);

        if (updatedPessoa != null) {
            return ResponseEntity.status(HttpStatus.OK).body(updatedPessoa);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        pessoaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
