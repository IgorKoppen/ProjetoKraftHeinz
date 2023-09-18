package com.kraftheinz.kraftheinzbackend.controller;


import com.kraftheinz.kraftheinzbackend.model.Marca;
import com.kraftheinz.kraftheinzbackend.model.Produto;
import com.kraftheinz.kraftheinzbackend.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    List<Produto> create(@RequestPart Produto produto, @RequestPart MultipartFile file) {
        return produtoService.create(produto, file);
    }

    @GetMapping
    List<Produto> list() {
        return produtoService.list();
    }
    @PutMapping
    List<Produto> update(@RequestBody  Produto Produto){
        return produtoService.update(Produto);
    }

    @DeleteMapping("{cod}")
    List<Produto> delete(@PathVariable("cod") Long cod){
        return produtoService.delete(cod);
    }
}
