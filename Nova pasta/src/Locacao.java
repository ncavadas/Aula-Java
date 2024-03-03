import java.util.Date;

public class Locacao {
    private Long id;
    private Long kmRetirada;
    private Long kmDevolucao;
    private Date inicio;
    private Date fim;
    private Boolean paga;
    private Veiculo veiculo;
    private Locatario locatario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKmRetirada() {
        return kmRetirada;
    }

    public void setKmRetirada(Long kmRetirada) {
        this.kmRetirada = kmRetirada;
    }

    public Long getKmDevolucao() {
        return kmDevolucao;
    }

    public void setKmDevolucao(Long kmDevolucao) {
        this.kmDevolucao = kmDevolucao;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Boolean getPaga() {
        return paga;
    }

    public void setPaga(Boolean paga) {
        this.paga = paga;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Locacao(Long id, Long kmRetirada, Long kmDevolucao, Date inicio,
                   Date fim, Boolean paga, Veiculo veiculo, Locatario locatario) {
        this.id = id;
        this.kmRetirada = kmRetirada;
        this.kmDevolucao = kmDevolucao;
        this.inicio = inicio;
        this.fim = fim;
        this.paga = paga;
        this.veiculo = veiculo;
        this.locatario = locatario;
        this.veiculo.addLocacao(this);
        this.locatario.addLocacao(this);
    }

    ///////////// Correção utilizando demeter /////////////////////
    public Double valorDiaria(){
        return this.veiculo.getValorDiaria();
    }
    public Double valorKmAdicional(){
        return  this.veiculo.getValorKmAdicional();
    }
    ////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", kmRetirada=" + kmRetirada +
                ", kmDevolucao=" + kmDevolucao +
                ", inicio=" + inicio +
                ", fim=" + fim +
                ", paga=" + paga +
                ", veiculo=" + veiculo +
                ", locatario=" + locatario +
                '}';
    }
}
