


import java.security.InvalidParameterException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reinaldo Luckman
 */
public class Locadora {
    
    private static Map<Long, Veiculo> veiculos;
    private static Map<Long, Locatario> locatarios;
    private static Map<Long, Locacao> locacoes;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
        
            instanciarObjetos();

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void locar(Long $idLocatario, Long $idVeiculo) {

        // 1. Verificar se o locatário de id respectivo existe e
        //    lançar uma mensagem de erro caso não exista.
        Locatario locatario = locatarios.get($idLocatario);
        if (locatario == null){
            throw new InvalidParameterException("Locatario não existente.");
        }
        // 2. Verificar se o veículo de id respectivo existe e lançar
        //    uma mensagem de erro caso não exista.
        Veiculo veiculo = veiculos.get($idVeiculo);
        if (veiculo == null) {
            throw new InvalidParameterException("Veículo não existente.");
        }
        // 3. Verificar se o veículo já não está locado e lançar uma
        //    mensagem de erro caso esteja.
        if (veiculo.estaLocado()){
            throw new InvalidParameterException("O veículo já está locado.");
        }
        // 4. Criar uma locação com a data atual como a data de início
        //    a km atual do carro como km de retirada.
        Locacao locacao = new Locacao();
        locacao.setId(locacoes.size()+1L);
        locacao.setInicio(new Date());
        locacao.setVeiculo(veiculo);
        locacao.setLocatario(locatario);
        locacao.setKmRetirada(veiculo.getKmAtual());
        locatario.getLocacoes().add(locacao);
        veiculo.getLocacoes().add(locacao);
        locacoes.put(locacao.getId(),locacao);
    }

    //corrigir no dia 18/04
    public static void devolver(Long $idLocacao, Long $kmDevolucao) {

        // 1. Verificar se a locação de id respectivo existe e
        //    lançar uma mensagem de erro caso não exista.
        Locacao locacao = locacoes.get($idLocacao);
        if (locacoes == null){
            throw new InvalidParameterException("Não há registro de locação.");
        }
        // 2. Setar a data de fim da locação para a data atual.
        locacao.setKmDevolucao(new Date());
        // 3. Setar a km de entrega da locação.
        locacao.setKmDevolucao($kmDevolucao);
        // 4. Setar que a locação ainda não foi paga.
        locacao.setPaga(false);
        // 5. Atualizar a km atual do veículo.
        Veiculo veiculo = locacao.getVeiculo();
        veiculo.setKmAtual($kmDevolucao);
    }
    public static void instanciarObjetos() throws ParseException {
        
        Veiculo veiculo = new Veiculo();
        veiculo.setId(1L);
        veiculo.setMarca("Fiat");
        veiculo.setModelo("Pálio 1.6 Flex");
        veiculo.setValorDiaria(100.0);
        veiculo.setValorKmAdicional(1.0);
        veiculos.put(veiculo.getId(),veiculo);

        Locatario locatario = new Locatario();
        locatario.setId(1L);
        locatario.setNome("João Maria José da Silva");
        locatarios.put(locatario.getId(),locatario);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        Locacao l1 = new Locacao();
        l1.setId(1L);
        l1.setVeiculo(veiculo);
        l1.setLocatario(locatario);
        l1.setInicio(format.parse("01/01/2015"));
        l1.setFim(format.parse("03/01/2015"));
        l1.setKmRetirada(0L);
        l1.setKmDevolucao(380L);
        l1.setPaga(true);

        locacoes.put(l1.getId(),l1);
        locatario.getLocacoes().add(l1);
        veiculo.getLocacoes().add(l1);
        
        Locacao l2 = new Locacao();
        l2.setId(2L);
        l2.setVeiculo(veiculo);
        l2.setLocatario(locatario);
        l2.setInicio(format.parse("04/01/2015"));
        l2.setFim(format.parse("07/01/2015"));
        l2.setKmRetirada(380L);
        l2.setKmDevolucao(980L);
        l2.setPaga(false);

        locacoes.put(l2.getId(),l2);
        locatario.getLocacoes().add(l2);
        veiculo.getLocacoes().add(l2);
        
        Locacao l3 = new Locacao();
        l3.setId(3L);
        l3.setVeiculo(veiculo);
        l3.setLocatario(locatario);
        l3.setInicio(format.parse("08/01/2015"));
        l3.setFim(format.parse("12/01/2015"));
        l3.setKmRetirada(980L);
        l3.setKmDevolucao(1980L);
        l3.setPaga(false);

        locacoes.put(l3.getId(),l3);
        locatario.getLocacoes().add(l3);
        veiculo.getLocacoes().add(l3);
        
    }
    
}

