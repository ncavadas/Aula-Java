public class PessoaFisica extends Cliente{
    private String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public PessoaFisica(String nome, String telefone, String endereco, String rg) {
        super(nome, telefone, endereco);
        this.rg = rg;
    }
}
