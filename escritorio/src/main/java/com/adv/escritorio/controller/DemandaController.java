package com.adv.escritorio.controller;

import com.adv.escritorio.model.Advogado;
import com.adv.escritorio.model.Demanda;
import com.adv.escritorio.service.AdvogadoService;
import com.adv.escritorio.service.DemandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/demanda")
public class DemandaController {

    @Autowired
    private DemandaService demandaService;

    @GetMapping
    public ResponseEntity<List<Demanda>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(demandaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Demanda> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(demandaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Demanda> create(@RequestBody Demanda demanda){
        return ResponseEntity.status(HttpStatus.CREATED).body(demandaService.save(demanda));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Demanda> update(@PathVariable Long id, @RequestBody Demanda demanda){
        demanda.setIdDemanda(id);
        return ResponseEntity.status(HttpStatus.OK).body(demandaService.update(demanda));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        demandaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
