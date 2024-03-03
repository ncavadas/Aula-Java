import java.util.ArrayList;
import java.util.List;

public class Consorcio extends Produto{
    private boolean sorteado;
    private List<ContaCorrente> contaCorrentes;


    public Consorcio(long id, int totalDeMeses, int mesesDecorridos,
                     Double montante, boolean sorteado, ContaCorrente contaCorrente) {
        super(id, totalDeMeses, mesesDecorridos, montante);
        this.sorteado = sorteado;
        this.contaCorrentes = new ArrayList<>();
        this.addContaCorrente(contaCorrente);
        contaCorrente.addConsorcio(this);
    }

    public boolean isSorteado() {
        return sorteado;
    }

    public void setSorteado(boolean sorteado) {
        this.sorteado = sorteado;
    }
    public void addContaCorrente (ContaCorrente contaCorrente){
        if(!this.contaCorrentes.contains(contaCorrente)){
            this.contaCorrentes.add(contaCorrente);
        }
    }
    public void assinado(ContaCorrente contaCorrente){
        this.addContaCorrente(contaCorrente);
        contaCorrente.addConsorcio(this);
    }
}
