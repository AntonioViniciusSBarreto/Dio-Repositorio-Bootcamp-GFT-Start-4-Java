/**
 * Enunciado
 * Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e
 * impares
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        System.out.println("Quantos números você deseja conferir: ");
        int N = lerN.nextInt();

        int contador = 0;
        int contPar = 0;
        int contImpar = 0;

        do {
            Scanner ler = new Scanner(System.in);
            System.out.println("Número: ");
            int num = lerN.nextInt();

            if (num % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
            contador++;
        }while (contador < N);

        System.out.println("Quantidade de números pares: " + contPar);
        System.out.println("Quantidade de números impares: " + contImpar);

    }
}
