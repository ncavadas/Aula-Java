public class Veiculo {
    private String placa;
    private String modelo;
    private Pessoa locatario;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }
    public String toString(){
        return this.placa+this.modelo+this.locatario.getNome();
    }
    public void setLocatario(Pessoa p){
        this.locatario = p;
    }
    public void eAlugado(Pessoa p){
        this.locatario = p;
        this.locatario.setVeiculo(this);
    }
}
