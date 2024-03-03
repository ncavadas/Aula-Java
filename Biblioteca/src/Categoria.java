import java.util.ArrayList;
import java.util.List;

public class Categoria {
    //tarefa

    private Long codigo;
    private String descricao;
    private List<Livro> livros;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.livros = new ArrayList<>();
        }
    public void addLivro(Livro livro) {
        if (!livros.contains(livro))
            this.livros.add(livro);
    }
    public void mostraLivros (){
        for (Livro l :this.livros){
            System.out.println(l.getTitulo());
        }
    }
    public String toString() {
        return "Editora{" +
                "nome='" + descricao + '\'' +
                '}';
    }
}

