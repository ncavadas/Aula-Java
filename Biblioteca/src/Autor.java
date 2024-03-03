import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private Nacionalidade nacionalidade;
    private List<Livro> livros;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Autor(String nome, Nacionalidade nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = new ArrayList<>();

    }
    public void addLivro(Livro livro) {
        if (!livros.contains(livro))
            this.livros.add(livro);
    }
    public Double gastoTotal(){
        Double soma = 0.0;
        for(Livro l : this.livros){
          soma += l.somaCustoCopias();
        }
        return soma;
    }
    public void mostraLivros (){
        for (Livro l :this.livros){
            System.out.println(l.getTitulo());
        }
    }
    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade=" + nacionalidade.getNome() +
                '}';
    }
}
