import java.util.ArrayList;
import java.util.List;

public class Locatario {
    private Long id;
    private String nome;
    private List<Locacao> locacoes;

    public Long getId() {
        return id;
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

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public Locatario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.locacoes = new ArrayList<>();
    }
    public void addLocacao(Locacao locacao){
        this.locacoes.add(locacao);
    }
    public Double divida() {

        // 1. Percorrer as locações do locatário e
        //    filtrar as que não foram pagas.
        List<Locacao> naoPagas = new ArrayList<>();
        for (Locacao l : this.locacoes){
            if (!l.getPaga()){
                System.out.println(l);
                naoPagas.add(l);
            }
        }
        // 2. Fazer o cálculo de quanto é o valor
        //    a pagar por cada locação que ainda
        //    não foi paga.
        // 3. Somar o cáculo de cada locação em
        //    um valor total.
        /*double total = 0;
        for (Locacao l : naoPagas){
            long qtdDias = (l.getFim().getTime()-l.getInicio().getTime())/(1000*60*60*24);
            if (qtdDias<1)
                qtdDias = 1;

            **** Linha 61 retira o getVeiculo e utiliza o método valorDiaria criado em locação ********

            total += qtdDias*l.getVeiculo().getValorDiaria();
            if (qtdDias*200<l.getKmDevolucao()-l.getKmRetirada()){

            **** Linha 66 retira o getVeiculo e utiliza o método valorKmAdicional criado em locação ********

                total += (qtdDias*200 - (l.getKmDevolucao()-l.getKmRetirada())*l.getVeiculo().getValorKmAdicional());
            };*/


        ///////////// Correção utilizando demeter /////////////////////
        double total = 0;
        for (Locacao l : naoPagas){
            long qtdDias = (l.getFim().getTime()-l.getInicio().getTime())/(1000*60*60*24);
            if (qtdDias<1)
                qtdDias = 1;
            total += qtdDias*l.valorDiaria();
            if (qtdDias*200<l.getKmDevolucao()-l.getKmRetirada()){
                total += (qtdDias*200 - (l.getKmDevolucao()-l.getKmRetirada())*l.valorKmAdicional());
            }

        }
        ////////////////////////////////////////////////////////////////
        // 4. Retornar esse valor total.
        return total;
    }

}

