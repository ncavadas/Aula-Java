import java.util.ArrayList;
import java.util.List;

public class Endereco {
    //Variáveis
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Cidade cidade;
    private List<Cliente> clientes;



    //Construtores

    public Endereco(){}
    public Endereco(String $rua, String $numero, String $complemento, String $bairro,
                    String $cep,Cidade cidade) {
        this.rua = $rua;
        this.numero = $numero;
        this.complemento = $complemento;
        this.bairro = $bairro;
        this.cep = $cep;
        this.cidade = cidade;
        this.clientes = new ArrayList<>();
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void addCliente(Cliente cliente){
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
        }
    }

}
