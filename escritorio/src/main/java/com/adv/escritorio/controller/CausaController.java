package com.adv.escritorio.controller;

import com.adv.escritorio.model.Causa;
import com.adv.escritorio.service.CausaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
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
    public ResponseEntity<Causa> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(causaService.findById(id.toString()));
    }

    @PostMapping
    public ResponseEntity<Causa> create(@RequestBody Causa causa){
        return ResponseEntity.status(HttpStatus.CREATED).body(causaService.save(causa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Causa> update(@PathVariable String id, @RequestBody Causa causa){
        causa.setIdDemanda(Long.parseLong(id));
        return ResponseEntity.status(HttpStatus.OK).body(causaService.update(causa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        causaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
