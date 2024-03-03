import java.util.ArrayList;
import java.util.List;

public class Editora {
    private String nome;
    private List<Livro> livros;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addLivro(Livro livro){
        if (!livros.contains(livro))
            this.livros.add(livro);
    }
    public Editora(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }
    public void mostraLivros (){
        for (Livro l :this.livros){
            System.out.println(l.getTitulo());
        }
    }

    @Override
    public String toString() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
