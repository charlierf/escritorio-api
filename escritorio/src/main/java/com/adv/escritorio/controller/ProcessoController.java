package com.adv.escritorio.controller;

import com.adv.escritorio.model.Processo;
import com.adv.escritorio.service.ProcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/processo")
public class ProcessoController {

    @Autowired
    private ProcessoService processoService;

    @GetMapping
    public ResponseEntity<List<Processo>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(processoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Processo>> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(processoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Processo> create(@RequestBody Processo Processo){
        return ResponseEntity.status(HttpStatus.CREATED).body(processoService.save(Processo));
    }

    @PutMapping
    public ResponseEntity<Processo> update(@RequestBody Processo Processo){
        return ResponseEntity.status(HttpStatus.OK).body(processoService.update(Processo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        processoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
