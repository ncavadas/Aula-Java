
import java.util.ArrayList;
import java.util.Collection;

public class Veiculo {
	
    private Long   id;
    private String marca;
    private String modelo;
    private Double valorDiaria;
    private Double valorKmAdicional;
    private Long kmAtual;

    private Collection<Locacao> locacoes;

    public Veiculo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Double getValorKmAdicional() {
        return valorKmAdicional;
    }

    public void setValorKmAdicional(Double valorKmAdicional) {
        this.valorKmAdicional = valorKmAdicional;
    }

    public Long getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(Long kmAtual) {
        this.kmAtual = kmAtual;
    }

    public Collection<Locacao> getLocacoes() {
        
        if (this.locacoes == null) {
            this.setLocacoes(new ArrayList<>());
        }
        
        return locacoes;
    }

    public void setLocacoes(Collection<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    public Boolean estaLocado (){
        for (Locacao l : this.getLocacoes()){
            if (l.getFim() == null){
                return true;
            }
        }
        return false;
    }
}