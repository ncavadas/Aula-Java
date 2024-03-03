public class Financiamento extends Produto {
    private Double taxaDeJuro;
    private ContaCorrente contaCorrente;

    public Financiamento(long id, int totalDeMeses, int mesesDecorridos,
                         Double montante, Double taxaDeJuro,ContaCorrente contaCorrente) {
        super(id, totalDeMeses, mesesDecorridos, montante);
        this.taxaDeJuro = taxaDeJuro;
        this.contaCorrente = contaCorrente;
        this.contaCorrente.addFinanciamento(this);
    }

    public Double getTaxaDeJuro() {
        return taxaDeJuro;
    }

    public void setTaxaDeJuro(Double taxaDeJuro) {
        this.taxaDeJuro = taxaDeJuro;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
