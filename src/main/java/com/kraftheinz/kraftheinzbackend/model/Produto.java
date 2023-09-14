package com.kraftheinz.kraftheinzbackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="produto_sequence")
    @SequenceGenerator(name="produto_sequence", sequenceName = "produto_sequence",initialValue=1, allocationSize=1)
    @Column(name = "PRODUTO_ID")
    private Long codProduto;
    @Column(name = "nome_produto")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @ManyToOne
    @JoinColumn(name="funcionario_id", nullable=false)
    private Funcionario funcionarios;

    @ManyToOne
    @JoinColumn(name="marca_id", nullable=false)
    @JsonBackReference
    private Marca marca;

    @OneToMany(mappedBy = "produtos")
    @JsonManagedReference
    private Set<AvaliacaoFuncionario> avaliacaoFuncionarios;

    @OneToMany(mappedBy = "produtos")
    @JsonManagedReference
    private Set<AvaliacaoCliente> avaliacaoClientes;

    public  Produto(){}
    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marcas) {
        this.marca = marcas;
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
}
