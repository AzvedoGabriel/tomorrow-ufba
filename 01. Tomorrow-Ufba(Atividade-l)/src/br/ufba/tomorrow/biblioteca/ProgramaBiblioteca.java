package br.ufba.tomorrow.biblioteca;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("Java OO", "Deschamp","Programacao",
                "Tomorrow Books", 2024, 20, "1", 20);

        Filme filme = new Filme("Pumpkin",
                "Peter", "sci-fi","Lucas Filme",2024, 55,
                "Cleber", "Fulano", "Filme baseado no movimento steampuk", 75);

        Publicacao[] publicacaos = new Publicacao[2];

        publicacaos[0] = livro;
        publicacaos[1] = filme;

    }
}
