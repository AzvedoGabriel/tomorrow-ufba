package br.ufba.tomorrow.biblioteca;

public class Filme extends Publicacao{

    private String diretor, atorPrincipal, sinopse;
    private float tempoDuracao;

    public Filme(String titulo, String autor, String genero, String editora,
                 int anoPublicacao, int qtdDisponivel, String diretor,
                 String atorPrincipal, String sinopse, float tempoDuracao) {
        super(titulo, autor, genero, editora, anoPublicacao, qtdDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    public String getDiretor() {

        return diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public String getSinopse() {
        return sinopse;
    }

    public float getTempoDuracao() {
        return tempoDuracao;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Diretor: \n" + diretor + "\nAtor Principal: \n"
                + atorPrincipal + "\nSinopse \n" + sinopse + "\nTempo de Duração: \n" + tempoDuracao);
    }
}
