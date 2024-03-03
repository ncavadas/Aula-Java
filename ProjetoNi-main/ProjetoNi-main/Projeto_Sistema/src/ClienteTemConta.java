import java.util.ArrayList;
import java.util.List;

public class ClienteTemConta {
    private char titularidade;
    private Conta conta;
    private Cliente cliente;


    public ClienteTemConta(char titularidade,Conta conta, Cliente cliente) {
        this.titularidade = titularidade;
        this.conta = conta;
        this.cliente = cliente;
        this.conta.addClienteTemConta(this);
    }

}
