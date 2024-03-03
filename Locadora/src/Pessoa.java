public class Pessoa {
    private String nome;
    private Veiculo carro;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void aluga(Veiculo v){
        this.carro = v;
        this.carro.setLocatario(this);
    }
    public String toString(){
        return this.nome+this.carro.getPlaca();
    }
    public void setVeiculo(Veiculo v){
        this.carro = v;

    }

}
