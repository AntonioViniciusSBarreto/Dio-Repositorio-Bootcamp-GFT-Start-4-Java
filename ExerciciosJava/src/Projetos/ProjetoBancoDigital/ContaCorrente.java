package ProjetoBancoDigital;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirInfoComum(){
        System.out.println("-------Extrato da conta Corrente-------");
        super.imprimirExtrato();
    }
}
