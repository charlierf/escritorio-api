package com.adv.escritorio.controller;

import com.adv.escritorio.model.Causa;
import com.adv.escritorio.service.CausaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/causa")
public class CausaController {

    @Autowired
    private CausaService causaService;

    @GetMapping
    public ResponseEntity<List<Causa>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(causaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Causa>> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(causaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Causa> create(@RequestBody Causa causa){
        return ResponseEntity.status(HttpStatus.CREATED).body(causaService.save(causa));
    }

    @PutMapping
    public ResponseEntity<Causa> update(@RequestBody Causa causa){
        return ResponseEntity.status(HttpStatus.OK).body(causaService.update(causa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        causaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
