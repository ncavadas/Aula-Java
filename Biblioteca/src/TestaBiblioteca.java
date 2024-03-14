import java.util.ArrayList;
import java.util.List;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Editora ed1 = new Editora("Leia");
        Categoria ca1 = new Categoria(3332L,"Terror");
        Nacionalidade na1 = new Nacionalidade("Brasileira");
        Autor au1 = new Autor("Zezin",na1);
        Autor au2 = new Autor("jiji",na1);
        List<Autor> autores1 = new ArrayList<>();
        autores1.add(au1);
        List<Autor> autores2 = new ArrayList<>();
        autores2.add(au2);
        Livro li1 = new Livro("12233","Abóbora",2012,ed1,ca1,autores1);
        Livro li2 = new Livro("5544","Feijão",2023,ed1,ca1,autores2);
        Copia c11 = new Copia(222L,38.0,li1);
        Copia c12 = new Copia(223L,78.0,li1);
        Copia c21 = new Copia(222L,58.0,li2);
        Copia c22 = new Copia(223L,78.0,li2);
        System.out.println(li1);
        System.out.println(au1);
        System.out.println(ca1);
        ed1.mostraLivros();
        ca1.mostraLivros();
        au1.mostraLivros();
        au2.mostraLivros();
        ca1.setDescricao("romance");
        System.out.println(au1.gastoTotal());
        System.out.println(au2.gastoTotal());
    }
}
