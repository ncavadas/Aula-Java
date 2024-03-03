public class ClientePessoaJuridica extends Cliente{
    //Variáveis
    private String cnpj;

    //Construtor
    public ClientePessoaJuridica(){}
    public ClientePessoaJuridica(String $nome,String $identificador,String $cnpj){
        super.setNome($nome);
        super.setIdentificador($identificador);
        this.cnpj = $cnpj;
    }

    //Get e Set
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public String getIdentificador() {
        return cnpj;
    }

    @Override
    public void setIdentificador(String identificador) {
        setCnpj(cnpj);
    }
}
