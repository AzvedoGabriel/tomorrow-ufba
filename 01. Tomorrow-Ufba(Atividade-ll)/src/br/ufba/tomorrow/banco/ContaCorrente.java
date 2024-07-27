package br.ufba.tomorrow.banco;

public class ContaCorrente {

    double salarioAtual = 0;

    public void executarOperacao(Operacao opr){
        salarioAtual +=opr.operar();
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }
}
