package model;


import java.sql.Date;

public class Cliente {
    private int codCliente;
    private String primeroNome, ultimoNome,senha,emailCliente,userName;
    private int idade;
    Date dataRegistro;

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

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
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

    public java.sql.Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
