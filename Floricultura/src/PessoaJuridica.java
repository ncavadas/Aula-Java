public class PessoaJuridica extends Cliente{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }
}
