public class Produto implements Tributavel{
    private long id;
    private int totalDeMeses;
    private int mesesDecorridos;
    private Double montante;

    public Produto(long id, int totalDeMeses, int mesesDecorridos, Double montante) {
        this.id = id;
        this.totalDeMeses = totalDeMeses;
        this.mesesDecorridos = mesesDecorridos;
        this.montante = montante;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTotalDeMeses() {
        return totalDeMeses;
    }

    public void setTotalDeMeses(int totalDeMeses) {
        this.totalDeMeses = totalDeMeses;
    }

    public int getMesesDecorridos() {
        return mesesDecorridos;
    }

    public void setMesesDecorridos(int mesesDecorridos) {
        this.mesesDecorridos = mesesDecorridos;
    }

    public Double getMontante() {
        return montante;
    }

    public void setMontante(Double montante) {
        this.montante = montante;
    }
    public Double imposto(){
        if (this.montante < 1000.0) {
            return this.montante*aliquotaIsento;
        } else if (this.montante<2000.0) {
            return  this.montante*aliquotaMedia;
        }
        else {
            return this.montante*aliquotaAlta;
        }
    }
}
