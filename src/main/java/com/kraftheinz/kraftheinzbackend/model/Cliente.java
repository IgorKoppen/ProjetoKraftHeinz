package com.kraftheinz.kraftheinzbackend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="cliente_sequence")
    @SequenceGenerator(name="cliente_sequence", sequenceName = "cliente_sequence",initialValue=1, allocationSize=1)
    @Column(name = "CLIENTE_ID")
    private Long codCliente;

    @Column(name="primeiro_nome")
    private String primeroNome;
    @Column(name="ultimo_nome")
    private String ultimoNome;
    @Column(name="senha_cliente")
    private String senha;
    @Column(name="email_cliente")
    private String emailCliente;
    @Column(name="username")
    private String userName;
    @Column(name="idade")
    private int idade;
    @Column(name="data_registro")
    Date dataRegistro;

    @OneToMany(mappedBy = "clientes")
    @JsonManagedReference
    private Set<AvaliacaoCliente> avaliacaoClientes;


    public Cliente(){}

    public Cliente(String primeroNome, String ultimoNome, String senha, String emailCliente, String userName, int idade) {
        this.primeroNome = primeroNome;
        this.ultimoNome = ultimoNome;
        this.senha = senha;
        this.emailCliente = emailCliente;
        this.userName = userName;
        this.idade = idade;
        this.dataRegistro = new Date(new java.util.Date().getTime());
    }

    public Long getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Long codCliente) {
        this.codCliente = codCliente;
    }

    public String getPrimeroNome() {
        return primeroNome;
    }

    public void setPrimeroNome(String primeroNome) {
        this.primeroNome = primeroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Set<AvaliacaoCliente> getAvaliacaoClientes() {
        return avaliacaoClientes;
    }

    public void setAvaliacaoClientes(Set<AvaliacaoCliente> avaliacaoClientes) {
        this.avaliacaoClientes = avaliacaoClientes;
    }
}
