

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Locacao {

    private Long    id;
    private Date    inicio;
    private Date    fim;
    private Long    kmRetirada;
    private Long    kmDevolucao;
    private Boolean paga;
    private Locatario locatario;
    private Veiculo   veiculo;

    public Locacao() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInicio() {
        return this.inicio;
    }

    public void setInicio(Date $inicio) {
        this.inicio = $inicio;
    }

    public Date getFim() {
        return this.fim;
    }

    public void setFim(Date $fim) {
        this.fim = $fim;
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

    public Boolean isPaga() {
        return this.paga;
    }

    public void setPaga(Boolean $paga) {
        this.paga = $paga;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Long duracaoEmDias() {

        Long duracaoEmMilisegundos = this.getFim().getTime() - this.getInicio().getTime();
        Long resultado = TimeUnit.DAYS.convert(duracaoEmMilisegundos, TimeUnit.MILLISECONDS);

        if (resultado == 0L) {
            resultado = 1L;
        }

        return resultado;
    }

    public Long kmRodados() {
        return this.getKmDevolucao() - this.getKmRetirada();
    }
}
