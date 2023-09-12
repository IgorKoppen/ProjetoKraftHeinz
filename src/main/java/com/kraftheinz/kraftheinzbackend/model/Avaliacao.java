package com.kraftheinz.kraftheinzbackend.model;

import java.sql.Date;

abstract public class Avaliacao {

    private String mensagem;
    private Date dataAvalicao;
    public Avaliacao(String mensagem) {
        this.mensagem = mensagem;
        this.dataAvalicao = new Date(new java.util.Date().getTime());
    }

    public Avaliacao() {

    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataAvalicao() {
        return dataAvalicao;
    }

    public void setDataAvalicao(Date dataAvalicao) {
        this.dataAvalicao = dataAvalicao;
    }


}
