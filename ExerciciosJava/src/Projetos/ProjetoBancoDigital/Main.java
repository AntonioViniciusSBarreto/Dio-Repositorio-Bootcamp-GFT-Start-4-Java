package ProjetoBancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente alexandre = new Cliente();
        alexandre.setNome("Alexandre Silva Moraes");

        Emprestimo emprestimoAlexandre = new Emprestimo();

        Conta corrente = new ContaCorrente(alexandre);
        Conta poupanca = new ContaPoupanca(alexandre);

        corrente.depositar(500);
        corrente.transferir(300,poupanca);


        emprestimoAlexandre.emprestar(10500.60,corrente);
        emprestimoAlexandre.taxaJuros(12);
        emprestimoAlexandre.imprimirInfoEmprestimo();

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
