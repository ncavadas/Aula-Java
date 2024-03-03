import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private List<Compra> compras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.compras = new ArrayList<>();
    }
    public void addCompra(Compra compra){
        if (!this.compras.contains(compra)){
            this.compras.add(compra);
        }
    }
}
