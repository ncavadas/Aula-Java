public class AplicacaoFinanceira {
    public static void main(String[] args) {
        //Objetos

        //Conta conta1= new Conta(); //*Não se cria objetos em classes abstratas*
        //Cliente cliente1 = new Cliente();
        Banco banco1= new Banco();
        Agencia agencia1= new Agencia();
        ContaCorrente contaCorrente1= new ContaCorrente(12,"q123",123,1234,222,3333);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        ClientePessoaFisica clientePessoaFisica1 = new ClientePessoaFisica();
        ClientePessoaJuridica clientePessoaJuridica1 = new ClientePessoaJuridica();



        /*//Conta
        conta1.setId(3333);
        conta1.setNumero("0866");
        System.out.println("ID da conta " + conta1.getId());
        System.out.println("Número da conta " + conta1.getNumero());*/

        /*//Cliente
        cliente1.setCpf("15711");
        cliente1.setNome("4222134");
        System.out.println("Cpf do cliente " + cliente1.getCpf());
        System.out.println("Nome do cliente " + cliente1.getNome());*/

        //Banco
        banco1.setId(1111);
        banco1.setNumero("4224");
        System.out.println("ID do banco " + banco1.getId());
        System.out.println("Número do banco " + banco1.getNumero());

        //Agência
        agencia1.setId(2222);
        agencia1.setNumero("9696");
        System.out.println("ID da agência " + agencia1.getId());
        System.out.println("Número da agência " + agencia1.getNumero());


        //Conta Corrente
        //((ContaCorrente)contaCorrente1).setLimite(7777); utiliza em casos de "Conta" ser abstrata
        /*contaCorrente1.setId(4444);
        contaCorrente1.setLimite(7777);
        contaCorrente1.setNumero("0866");
        System.out.println("ID da conta corrente " + contaCorrente1.getId());
        System.out.println("Limite da conta corrente " + contaCorrente1.getLimite());
        contaCorrente1.setTaxa(123);*/


        //Conta Poupança
        contaPoupanca1.setId(2244);
        contaPoupanca1.setNumero("7227");
        contaPoupanca1.setNumero("0866");
        System.out.println("ID da conta poupança " + contaPoupanca1.getId());
        System.out.println("Número da conta poupança " + contaPoupanca1.getNumero());

        //Pessoa Física
        clientePessoaFisica1.setRg("77.777.777-7");
        clientePessoaFisica1.setCpf("111.111.111-72");
        clientePessoaFisica1.setNome("Jureminha");
        System.out.println("Nome do Cliente " + clientePessoaFisica1.getNome());
        System.out.println("RG do Cliente " + clientePessoaFisica1.getRg());
        System.out.println("CPF do Cliente " + clientePessoaFisica1.getCpf());

        //Pessoa Jurídica
        clientePessoaJuridica1.setCnpj("99.999.999/0001-99");
        clientePessoaJuridica1.setNome("Robson SA");
        System.out.println("Nome do Cliente " + clientePessoaJuridica1.getNome());
        System.out.println("CNPJ do Cliente " + clientePessoaJuridica1.getCnpj());





    }
}
