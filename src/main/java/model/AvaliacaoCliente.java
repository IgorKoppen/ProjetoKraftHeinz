package model;

final public class AvaliacaoCliente extends Avaliacao {
    private int codAvaliacoesCliente, codCliente, codProduto;

    public AvaliacaoCliente(){}
    public AvaliacaoCliente(String mensagem, int codCliente, int codProduto) {
        super(mensagem);
        this.codCliente = codCliente;
        this.codProduto = codProduto;
    }

    public int getCodAvaliacoesCliente() {
        return codAvaliacoesCliente;
    }

    public void setCodAvaliacoesCliente(int codAvaliacoesCliente) {
        this.codAvaliacoesCliente = codAvaliacoesCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
}
