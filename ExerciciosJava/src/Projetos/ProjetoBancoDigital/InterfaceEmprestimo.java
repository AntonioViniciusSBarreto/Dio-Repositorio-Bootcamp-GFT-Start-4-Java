package ProjetoBancoDigital;

public interface InterfaceEmprestimo {
    void emprestar(double valor, Conta contaEmprestar);

    void taxaJuros(int tempo);

    void imprimirInfoEmprestimo();
}
