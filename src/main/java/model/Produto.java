package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codProduto;
    private String nome, descricao;

    private List<AvaliacaoCliente> avaliacaoClientes = new ArrayList<>();
    public  Produto(){}
    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
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

    public List<AvaliacaoCliente> getAvaliacaoCliente() {
        return avaliacaoClientes;
    }

    public void adicionarAvaliacaoCliente(AvaliacaoCliente avaliacaoCliente) {
        avaliacaoClientes.add(avaliacaoCliente);
    }
}
