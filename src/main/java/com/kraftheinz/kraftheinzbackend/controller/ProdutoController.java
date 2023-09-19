package com.kraftheinz.kraftheinzbackend.controller;


import com.kraftheinz.kraftheinzbackend.model.Marca;
import com.kraftheinz.kraftheinzbackend.model.Produto;
import com.kraftheinz.kraftheinzbackend.service.ProdutoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    ResponseEntity<?> create(@RequestPart Produto produto, @RequestPart MultipartFile file) {
        if(produto != null && file != null) {
            return new ResponseEntity<>(produtoService.create(produto, file), HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Faltou parametros para produto e file", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    List<Produto> list() {
        return produtoService.list();
    }
    @PutMapping
    List<Produto> update(@RequestBody  Produto Produto){
        return produtoService.update(Produto);
    }

    @GetMapping("{cod}")
    Optional<Produto>  findById(@PathVariable("cod") Long cod){ return produtoService.findById(cod);}
    @DeleteMapping("{cod}")
    List<Produto> delete(@PathVariable("cod") Long cod){
        return produtoService.delete(cod);
    }
    @GetMapping("paginada")
    public Page<Produto> findAll(@RequestParam int page, @RequestParam int size) {
        PageRequest pr = PageRequest.of(page,size);
        return produtoService.listaPaginada(pr);
    }
}
