public class ItemDeCompra {
    private int quantidade;
    private Compra compra;
    private Produto produto;


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Compra getCompra() {
        return compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public ItemDeCompra(int quantidade, Compra compra, Produto produto) {
        this.quantidade = quantidade;
        this.compra = compra;
        this.compra.addItemDeCompra(this);
        this.produto = produto;
        this.produto.addItemDeCompra(this);
        this.produto.atualizaQtd(-quantidade);

    }
}
