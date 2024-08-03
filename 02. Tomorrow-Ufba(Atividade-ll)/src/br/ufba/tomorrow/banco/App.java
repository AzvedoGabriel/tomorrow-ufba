package br.ufba.tomorrow.banco;

public class App {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();

        Banco nubank = new Banco("João", conta1, "Junior", conta2, "Cleber", conta3);

        nubank.creditar("João", 1500.000);
        nubank.debitar("Cleber", 2000.000);
        nubank.transferir("Junior", "Cleber", 5000);

        System.out.println("\nCorrentistas | Saldo" +
                "\nJunior: " + nubank.getSaldo("Junior") +
                "\nCleber: " + nubank.getSaldo("Cleber"));
    }
}
