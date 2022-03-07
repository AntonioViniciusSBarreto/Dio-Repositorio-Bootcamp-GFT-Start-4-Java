package ProjetoBancoDigital;

public class Emprestimo implements InterfaceEmprestimo {
    protected double valorEmpresimo;
    protected double juros;
    protected int tempoPagamento;


    @Override
    public void emprestar(double valor, Conta contaEmprestar) {
        this.valorEmpresimo = valor;
        contaEmprestar.depositar(valorEmpresimo);
    }

    @Override
    public void taxaJuros(int tempo) {
        this.tempoPagamento = tempo;
        if (tempo < 12){
            juros = 0.3 * valorEmpresimo;
        }else{
            juros = 0.6 * valorEmpresimo;
        }
    }

    @Override
    public void imprimirInfoEmprestimo() {
        System.out.println("-------Informações do Emprestimo-------");
        System.out.printf("Valor do Emprestimo: %.2f%n",this.valorEmpresimo);
        System.out.printf("Valor do juros: %.2f%n",this.juros);
        System.out.printf("Tempo a pagar:%d%n",this.tempoPagamento);
        System.out.printf("Valor do total: %.2f%n", (this.juros + valorEmpresimo));
    }
}

