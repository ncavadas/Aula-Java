public class Teste {
    public static void main(String[] args) {


    Veiculo c1 = new Veiculo("mcn-2938","gol");

    Pessoa p2 = new Pessoa("José");
    Pessoa p1 = new Pessoa("Nina");
    p1.aluga(c1);

        System.out.println(p1);
        System.out.println(c1);
    c1.eAlugado(p2);
        System.out.println(p2);
        System.out.println(c1);
    }
}
