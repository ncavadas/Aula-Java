import java.util.ArrayList;
import java.util.List;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Editora ed1 = new Editora("Leia");
        Categoria ca1 = new Categoria(3332L,"Terror");
        Nacionalidade na1 = new Nacionalidade("Brasileira");
        Autor au1 = new Autor("Zezin",na1);
        Autor au2 = new Autor("jiji",na1);
        List<Autor> autores = new ArrayList<>();
        autores.add(au1);
        autores.add(au2);
        Livro li1 = new Livro("12233","Abóbora",2012,ed1,ca1,autores);
        Livro li2 = new Livro("5544","Feijão",2023,ed1,ca1,autores);
        System.out.println(li1);
        System.out.println(au1);
        System.out.println(ca1);
        ed1.mostraLivros();
        ca1.mostraLivros();
        au1.mostraLivros();
        au2.mostraLivros();
        ca1.setDescricao("romance");
        System.out.println(li1);
    }
}
