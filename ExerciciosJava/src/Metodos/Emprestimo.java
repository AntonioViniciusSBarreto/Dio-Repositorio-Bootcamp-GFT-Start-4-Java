
import java.util.Scanner;

public class Emprestimo{
    
    public static void calculo() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do empréstimo: ");
        double valorEmprestimo = ler.nextFloat();

        if (valorEmprestimo > 1000 && valorEmprestimo < 5000){
            valorEmprestimo = valorEmprestimo * 1.20;
            System.out.println("O valor desse empréstimo agora é: "+valorEmprestimo);
        }else if(valorEmprestimo > 5000 && valorEmprestimo < 10000){
            valorEmprestimo = valorEmprestimo * 5.20;
            System.out.println("O valor desse empréstimo agora é: "+valorEmprestimo);
        }else if(valorEmprestimo > 10000){
            valorEmprestimo = valorEmprestimo * 10.20;
            System.out.println("O valor desse empréstimo agora é: "+valorEmprestimo);
        }else{
            System.out.println("Valor muito baixo para a cobrança de uma taxa");
        }
        ler.close();
    }
}