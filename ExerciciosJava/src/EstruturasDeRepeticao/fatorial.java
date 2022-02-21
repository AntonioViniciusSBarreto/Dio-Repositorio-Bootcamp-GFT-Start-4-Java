/**
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
 */

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Número desejado: ");
        double numFatorial = ler.nextInt();

        for (double i = numFatorial - 1; i > 0; i--){
            double resultado = numFatorial * i;
            numFatorial = resultado;
        }
        System.out.println("Fatorial = " + numFatorial);
    }
}




