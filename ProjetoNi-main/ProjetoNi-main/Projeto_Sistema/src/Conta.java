import java.util.ArrayList;
import java.util.List;

public abstract class Conta {

    private int id;
    private String numero;
    private double saldo;
    private double taxa;
    private Agencia agencia;
    private List <ClienteTemConta> clienteTemContas;




    //Construtor Conta
    public Conta() {}
    public Conta(int $id, String $numero, double $saldo,double $taxa,
                 Agencia agencia){
        this.id = $id;
        this.numero = $numero;
        this.saldo = $saldo;
        this.taxa = $taxa;
        this.agencia = agencia;
        this.agencia.addConta(this);
        this.clienteTemContas = new ArrayList<>();
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

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxa() {
        return 0.0;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public void addClienteTemConta(ClienteTemConta clienteTemConta){
        if(!this.clienteTemContas.contains(clienteTemConta)){
            this.clienteTemContas.add(clienteTemConta);
            
        }
    }





}
