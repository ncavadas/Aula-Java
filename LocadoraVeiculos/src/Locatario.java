

import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Locatario {

    private Long   id;
    private String nome;
    private Collection<Locacao> locacoes;

    public Locatario() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Collection<Locacao> getLocacoes() {
        
        if (this.locacoes == null) {
            this.setLocacoes(new ArrayList<>());
        }
        
        return this.locacoes;
    }
    public void setLocacoes(Collection<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    public Double divida() {

        // 1. Percorrer as locações do locatário e
        //    filtrar as que não foram pagas.
    	Collection<Locacao> naoPagas = new ArrayList<>();
        for(Locacao l: this.locacoes) {
        	if (!l.isPaga()) {
        		naoPagas.add(l);
        	}
        }
        double total=0;
        for(Locacao l: naoPagas) {
		    // 2. Fazer o cálculo de quanto é o valor
		    //    a pagar por cada locação que ainda 
		    //    não foi paga.
    	    // 3. Somar o cáculo de cada locação em
            //    um valor total.

		    Long duracaoEmMilisegundos
        		     		= l.getFim().getTime()-l.getInicio().getTime();
        	Long dias =
        		 TimeUnit.DAYS.convert(duracaoEmMilisegundos,TimeUnit.MILLISECONDS);
        	total += dias*l.getVeiculo().getValorDiaria();
        	if (l.getKmDevolucao()-l.getKmRetirada()>=200) {
        		total += (l.getKmDevolucao()-l.getKmRetirada()-200)*l.getVeiculo().getValorKmAdicional();
        	}

        }
        // 4. Retornar esse valor total.
    	
        return total;
    }
    public Boolean ehBomPagador() {
        return this.divida() <= 100.0;
    }
    public void pagar(Locacao $locacao)
            throws IllegalArgumentException, IllegalStateException {

        if (!this.getId().equals($locacao.getLocatario().getId())) {
            throw new IllegalArgumentException("O aluguel não pertente ao locatário.");
        }

        if ($locacao.isPaga()) {
            throw new IllegalStateException("O aluguel já está pago.");
        }

        $locacao.setPaga(true);
    }
    public String categoria() {

        if (this.locacoes.size() > 100) {
            return "OURO";
        }

        if (this.locacoes.size() >= 50) {
            return "PRATA";
        }

        return "BRONZE";
    }
    public Collection<Locacao> locacoesEmAberto() {

        Collection<Locacao> resultado = new ArrayList<>();

        for (Locacao locacao : this.getLocacoes()) {

            if (!locacao.isPaga()) {
                resultado.add(locacao);
            }
        }

        return resultado;
    }
}
