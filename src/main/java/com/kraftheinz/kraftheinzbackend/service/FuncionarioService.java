package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Funcionario;
import com.kraftheinz.kraftheinzbackend.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) { this.funcionarioRepository = funcionarioRepository; }
    public List<Funcionario> create(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return list();
    }
    public List<Funcionario> list() { return funcionarioRepository.findAll(); }
    public List<Funcionario> update(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return list();
    }
    public List<Funcionario> delete(Long cod) {
        funcionarioRepository.deleteById(cod);
        return list();
    }
}
