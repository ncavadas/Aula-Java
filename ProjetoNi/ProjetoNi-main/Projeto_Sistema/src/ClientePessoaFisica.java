public class ClientePessoaFisica extends Cliente{
    //Variáveis
    private String cpf;
    private String rg;

    //Construtor
    public ClientePessoaFisica(){}
    public ClientePessoaFisica(String $identificador,String $nome,String $rg){
        super.setIdentificador($identificador);
        super.setNome($nome);
        this.rg = $rg;
    }

    //Get e Set

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getIdentificador() {
        return cpf;
    }

    @Override
    public void setIdentificador(String identificador) {
        setCpf(cpf);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
