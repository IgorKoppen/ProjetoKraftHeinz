package com.kraftheinz.kraftheinzbackend.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kraftheinz.kraftheinzbackend.model.Marca;
import com.kraftheinz.kraftheinzbackend.model.Produto;
import org.springframework.web.bind.annotation.*;
import com.kraftheinz.kraftheinzbackend.service.MarcaService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    private final MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping
    List<Marca> create(@RequestPart Marca marca,@RequestPart MultipartFile file)  {
        return marcaService.create(marca, file);
    }

    @GetMapping
    List<Marca> list() {
        return marcaService.list();
    }
    @PutMapping
    List<Marca> update(@RequestBody  Marca marca){
        return marcaService.update(marca);
    }
    @DeleteMapping("{cod}")
    List<Marca> delete(@PathVariable("cod") Long cod){
        return marcaService.delete(cod);
}
}
