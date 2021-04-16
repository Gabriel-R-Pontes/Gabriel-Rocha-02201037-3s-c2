package br.com.bandtec.lutalivre.controller;

import br.com.bandtec.lutalivre.dominio.Lutador;
import br.com.bandtec.lutalivre.repositorio.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/Lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    @PostMapping
    public ResponseEntity postLutadores(@RequestBody @Valid Lutador novoLutador){
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getLutadores(@RequestParam Integer id, @RequestParam Integer forcaGolpe){
        return ResponseEntity.status(201).build(repository.findAllByIdOrderByForcaGolpeDesc(id, forcaGolpe));
    }



    @GetMapping("/contagem-vivos")
    public ResponseEntity getContagemVivos(){
        return ResponseEntity.status(201).build();
    }
    @PostMapping("{x}/concentrar")
    public ResponseEntity postContagemVivos(){
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/golpe")
    public ResponseEntity postGolpe(){
        return ResponseEntity.status(201).build();
    }


    @GetMapping("/mortos")
    public ResponseEntity getContagemVivos(){
        return ResponseEntity.status(201).build(repository);

}
