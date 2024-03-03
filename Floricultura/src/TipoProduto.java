import java.util.ArrayList;
import java.util.List;

public class TipoProduto {
    private String descricao;
    private int codigo;
    private List<Produto> produtos;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public TipoProduto(String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.produtos = new ArrayList<>();
    }
    public void addProduto(Produto produto){
        if (!this.produtos.contains(produto)){
            this.produtos.add(produto);
        }
    }
}
