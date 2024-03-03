public class Copia {
    //aula
    private Long codigo;
    private Double preco;
    private Livro livro;


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Copia(Long codigo, Double preco, Livro livro) {
        this.codigo = codigo;
        this.preco = preco;
        this.livro = livro;
        this.livro.addCopia(this);
    }
}
