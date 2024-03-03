public class ContaInvestimento extends Conta implements Tributavel {
    private Double taxaDeRendimento;
    private String dataInicio;


    public ContaInvestimento(int $id, String $numero, double $saldo, double $taxa, Double taxaDeRendimento, String dataInicio) {
        super($id, $numero, $saldo, $taxa);
        this.taxaDeRendimento = taxaDeRendimento;
        this.dataInicio = dataInicio;
    }

    public Double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(Double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Double imposto() {
        if (this.getSaldo() < 1000.0) {
            return this.getSaldo() * aliquotaIsento;
        } else if (this.getSaldo() < 2000.0) {
            return this.getSaldo() * aliquotaMedia;
        } else {
            return this.getSaldo() * aliquotaAlta;
        }
    }
}
