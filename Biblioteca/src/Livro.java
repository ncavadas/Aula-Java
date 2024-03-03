import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String isbn;
    private String titulo;
    private int ano;
    private Editora editora;
    private Categoria categoria;
    private List<Autor> autores;
    private List<Copia> copias;



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Livro(String isbn, String titulo, int ano,
                 Editora editora,Categoria categoria,
                 List<Autor>autores) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.editora.addLivro(this);
        this.categoria = categoria;
        this.categoria.addLivro(this);
        this.copias = new ArrayList<>();
        this.autores = new ArrayList<>();
        for (Autor a : autores){
            this.addAutor(a);
            a.addLivro(this);
        }


    }
    public void addCopia(Copia copia){
        if (!copias.contains(copia))
            this.copias.add(copia);
    }
    public void addAutor(Autor autor) {
        if (!autores.contains(autor))
            this.autores.add(autor);
    }
    public Double somaCustoCopias(){
        Double soma = 0.0;
        for (Copia c : this.copias){
            soma += c.getPreco();
        }
        return soma;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", editora=" + editora +"Categoria"+categoria+
                '}';
    }
}
