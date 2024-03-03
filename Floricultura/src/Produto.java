import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String descricao;
    private double preco;
    private int quantidade;
    private TipoProduto tipo;
    private List<ItemDeCompra> itensDeCompra;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void atualizaQtd(int quantidade){
        this.quantidade += quantidade;
    }
    public Produto(String descricao, double preco, int quantidade, TipoProduto tipo) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.tipo.addProduto(this);
        this.itensDeCompra = new ArrayList<>();

    }
    public void addItemDeCompra (ItemDeCompra item){
        if (!this.itensDeCompra.contains(item))
            this.itensDeCompra.add(item);

    }
}
