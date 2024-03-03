import java.util.ArrayList;
import java.util.List;

public class Banco {
    //criar construtor de cada um na aplicação financeira e tirar os sets caso o consrutor n fique vaziov

    //Variáveis
    private int id;
    private String numero;
    private String cnpj;
    private String nome;
    private List <Agencia> agencias;



    //Construtor Banco
    public Banco() {}
    public Banco(int $id, String $numero,String $cnpj, String $nome) {
        this.id = $id;
        this.numero = $numero;
        this.cnpj = $cnpj;
        this.nome = $nome;
        this.agencias = new ArrayList<>();
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

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAgencia(Agencia agencia){
        if (!this.agencias.contains(agencia)) {
            this.agencias.add(agencia);
        }
    }
}
