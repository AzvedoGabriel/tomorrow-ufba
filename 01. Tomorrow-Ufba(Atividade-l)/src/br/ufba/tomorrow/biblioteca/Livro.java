package br.ufba.tomorrow.biblioteca;

public class Livro extends Publicacao{
    private String edicao;
    private int isbn;

    public Livro(String titulo, String autor, String genero, String editora,
                 int anoPublicacao, int qtdDisponivel, String edicao, int isbn) {
        super(titulo, autor, genero, editora, anoPublicacao, qtdDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public void imprimirDados() {
        System.out.printf("Edicao: %s\nIsbn: %d\n", edicao, isbn);
    }
}
