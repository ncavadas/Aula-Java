public class Floricultura {
    public static void main(String[] args) {
    TipoProduto flor = new TipoProduto("Flor",1234);
    Produto rosa = new Produto("Rosa",1.02,2,flor);
    Produto copoDeLeite = new Produto("Copo de leite",3.60,10,flor);
    PessoaFisica cliente1 = new PessoaFisica("Nina","999933332","rua amora","989898-56");
    Compra c1 = new Compra("23/10/2024",cliente1);
    c1.addItem(rosa,1);
    c1.addItem(rosa,1);
    c1.addItem(copoDeLeite,2);
    c1.addItem(copoDeLeite,8);
    c1.totaliza();
    }

}
