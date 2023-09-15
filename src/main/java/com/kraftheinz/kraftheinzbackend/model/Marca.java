package com.kraftheinz.kraftheinzbackend.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="marca_sequence")
    @SequenceGenerator(name="marca_sequence", sequenceName = "marca_sequence", initialValue=1, allocationSize=1)
    @Column(name = "MARCA_ID")
    private Long codMarca;
    @Column(name = "nome_marca")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "FUNCIONARIO_ID", nullable = false)
    @JsonBackReference(value = "marcas-funcionario")
    private Funcionario funcionario;

    @OneToMany
    @JsonManagedReference(value = "marcas-avaliacaofuncionario")
    private Set<AvaliacaoFuncionario> avaliacaoFuncionarios;

    @OneToMany
    @JsonManagedReference(value = "marcas-avaliacaoclientes")
    private Set<AvaliacaoCliente> avaliacaoClientes;


    @OneToMany(mappedBy="marca")
    @JsonManagedReference(value = "marcas-produtos")
    private Set<Produto> produtos;

    public Marca(String nome) {
        this.nome = nome;
    }

    public Marca() {
    }

    public Long getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(Long codMarca) {
        this.codMarca = codMarca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionarios) {
        this.funcionario = funcionarios;
    }

    public Set<AvaliacaoFuncionario> getAvaliacaoFuncionarios() {
        return avaliacaoFuncionarios;
    }

    public void setAvaliacaoFuncionarios(Set<AvaliacaoFuncionario> avaliacaoFuncionarios) {
        this.avaliacaoFuncionarios = avaliacaoFuncionarios;
    }

    public Set<AvaliacaoCliente> getAvaliacaoClientes() {
        return avaliacaoClientes;
    }

    public void setAvaliacaoClientes(Set<AvaliacaoCliente> avaliacaoClientes) {
        this.avaliacaoClientes = avaliacaoClientes;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }
}
