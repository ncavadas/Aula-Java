import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    //Variáveis
    private String identificador;
    private String nome;
    private Endereco endereco;
    private List <ClienteTemConta> clienteTemContas;


    //Construtor
    public Cliente(){}
    public Cliente(String $identificador, String $nome,Endereco endereco){
        this.identificador = $identificador;
        this.nome = $nome;
        this.endereco = endereco;
        this.endereco.addCliente(this);
        this.clienteTemContas = new ArrayList<>();
    }


    //Get e Set
    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setClienteTemContas(char titularidade,Conta conta){
        ClienteTemConta clienteTemConta = new ClienteTemConta(titularidade,conta,this);
        this.clienteTemContas.add(clienteTemConta);
    }
}
