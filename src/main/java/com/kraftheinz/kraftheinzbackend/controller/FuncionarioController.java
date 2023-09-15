package com.kraftheinz.kraftheinzbackend.controller;

import com.kraftheinz.kraftheinzbackend.model.Funcionario;
import com.kraftheinz.kraftheinzbackend.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) { this.funcionarioService = funcionarioService; }

    @PostMapping
    List<Funcionario> create(@RequestBody Funcionario funcionario) {
        return funcionarioService.create(funcionario);
    }

    @GetMapping
    List<Funcionario> list() { return funcionarioService.list(); }

    @PutMapping
    List<Funcionario> update(@RequestBody Funcionario funcionario) { return funcionarioService.update(funcionario); }

    @DeleteMapping("{cod}")
    List<Funcionario> delete(@PathVariable("cod") Long cod) { return funcionarioService.delete(cod); }
}
