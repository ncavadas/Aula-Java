public class ContaPoupanca extends Conta {
    //criar construtor de cada um na aplicação financeira e tirar os sets caso o consrutor n fique vazio
    //Variáveis
    /*private int id;
    private String numero;
    private double saldo;*/
    private int diaDeAniversario;
    private double taxaDeCorrecao;

    //Construtor
    public ContaPoupanca(){}
    public ContaPoupanca(int $id, String $numero, double $saldo,double $taxa,int $diaDeAniversario, double $taxaDeCorrecao){
        super.setId($id);
        super.setNumero($numero);
        super.setSaldo($saldo);
        super.setTaxa($taxa);
        this.diaDeAniversario = $diaDeAniversario;
        this.taxaDeCorrecao = $taxaDeCorrecao;
    }

    //Get e Set
    /*public int getId() {
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
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    }*/
    public int getDiaDeAniversario() {
        return this.diaDeAniversario;
    }
    public void setDiaDeAniversario(int diaDeAniversario) {
        this.diaDeAniversario = diaDeAniversario;
    }
    public double getTaxaDeCorrecao() {
        return this.taxaDeCorrecao;
    }
    public void setTaxaDeCorrecao(double taxaDeCorrecao) {
        this.taxaDeCorrecao = taxaDeCorrecao;
    }

    @Override
    public double getTaxa() {
        return getTaxaDeCorrecao();
    }

    @Override
    public void setTaxa(double taxa) {
        setTaxaDeCorrecao(taxaDeCorrecao);
    }
}
