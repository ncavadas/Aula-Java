import java.util.ArrayList;
import java.util.List;

public class Compra {
    //cliente para compra mesma coisa feita no tipo produto produto
    private String dataCompra;
    private Cliente cliente;
    private List<ItemDeCompra> itensDeCompra;
    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Compra(String dataCompra, Cliente cliente) {
        this.dataCompra = dataCompra;
        this.cliente = cliente;
        this.cliente.addCompra(this);
        this.itensDeCompra = new ArrayList<>();
    }
    public void addItemDeCompra (ItemDeCompra item){
        if (!this.itensDeCompra.contains(item))
            this.itensDeCompra.add(item);

    }
    public void addItem (Produto produto,int quantidade){
        if (quantidade> produto.getQuantidade()){
            System.out.println("Estoque disponível:"+produto.getQuantidade());
            return;
        }
        ItemDeCompra itemDeCompra = new ItemDeCompra(quantidade,this,produto);
    }
    public void totaliza (){
        double total = 0;
        if (this.itensDeCompra.isEmpty()){
            System.out.println("Não há itens nessa compra");
            return;
        }
        for (ItemDeCompra i : this.itensDeCompra){
            System.out.println("Item: "+i.getProduto().getDescricao()+
                    "Preço: "+i.getProduto().getPreco()+
                    "Quantidade: "+i.getQuantidade()+
                    "Subtotal: "+i.getProduto().getPreco()* i.getQuantidade());
            total+=i.getProduto().getPreco()* i.getQuantidade();
        }
        System.out.println("Total da compra: "+total);
    }
}
