import java.util.ArrayList;
import java.util.List;

public class Agencia {
    //criar construtor de cada um na aplicação financeira e tirar os sets caso o consrutor n fique vazio

    //Variáveis
    private int id;
    private String numero;
    private String nome;
    private Banco banco;
    private List<Conta> contas;


    //Construtor
    public Agencia() {}
    public Agencia(int $id, String $numero,String $nome,Banco banco){
        this.id = $id;
        this.numero = $numero;
        this.nome = $nome;
        this.banco = banco;
        this.banco.addAgencia(this);
        this.contas = new ArrayList<>();
    }

    //Get e Set
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Banco getBanco() {
        return banco;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addConta(Conta conta){
        if(!this.contas.contains(conta)){
            this.contas.add(conta);
        }
    }
}
