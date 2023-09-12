package com.kraftheinz.kraftheinzbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="funcionario_sequence")
    @SequenceGenerator(name="funcionario_sequence", sequenceName = "fun_seq")
    @Column(name = "FUNCIONARIO_ID")
    private Long codFuncionario;
    private String primeiroNome;
    private String ultimoNome;
    private String senha;
    private String cargo;
    private String emailFuncionario;
    private int cpfFuncionario;


    public Funcionario(String primeiroNome, String ultimoNome, String senha, String cargo, String emailFuncionario, int cpfFuncionario) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.senha = senha;
        this.cargo = cargo;
        this.emailFuncionario = emailFuncionario;
        this.cpfFuncionario = cpfFuncionario;
    }

    public Funcionario() {
    }

    public Long getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Long codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public int getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(int cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }
}
