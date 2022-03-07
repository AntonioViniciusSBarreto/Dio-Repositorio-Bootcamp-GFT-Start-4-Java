package ProjetoBancoDigital;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirInfoComum(){
        System.out.println("-------Extrato da conta Poupanca-------");
        super.imprimirExtrato();
    }
}
