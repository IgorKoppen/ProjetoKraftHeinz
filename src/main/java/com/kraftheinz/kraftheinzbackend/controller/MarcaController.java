package com.kraftheinz.kraftheinzbackend.controller;


import com.kraftheinz.kraftheinzbackend.model.Marca;
import org.springframework.web.bind.annotation.*;
import com.kraftheinz.kraftheinzbackend.service.MarcaService;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    private MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping
    List<Marca> create(@RequestBody Marca marca) {
        return marcaService.create(marca);
    }

    @GetMapping
    List<Marca> list() {
        return marcaService.list();
    }
    @PutMapping
    List<Marca> update(@RequestBody  Marca marca){
        return marcaService.update(marca);
    }
@DeleteMapping
    List<Marca> delete(Long cod){
        return marcaService.delete(cod);
}
}
