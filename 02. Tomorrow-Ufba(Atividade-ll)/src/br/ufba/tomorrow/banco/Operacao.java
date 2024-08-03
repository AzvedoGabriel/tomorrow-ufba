package br.ufba.tomorrow.banco;

public abstract class Operacao {

    protected double valor;

    public abstract double operar();

    public Operacao(double valor) {
        this.valor = valor;
    }
}
