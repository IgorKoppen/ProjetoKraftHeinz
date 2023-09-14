package com.kraftheinz.kraftheinzbackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
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
    @JoinColumn(name="funcionario_id", nullable=false)
    private Funcionario funcionarios;

    @OneToMany(mappedBy = "marcas")
    @JsonManagedReference
    private Set<AvaliacaoFuncionario> avaliacaoFuncionarios;

    @OneToMany(mappedBy = "marcas")
    @JsonManagedReference
    private Set<AvaliacaoCliente> avaliacaoClientes;


    @OneToMany(mappedBy="marca")
    @JsonManagedReference
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

    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios = funcionarios;
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
