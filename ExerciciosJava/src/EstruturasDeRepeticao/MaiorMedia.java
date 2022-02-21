/**
 * Enunciado
 * Faça um programa que leia 5 números e infome o maior número e a média desses números.
 */

import  java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        int contador = 0;
        int maior = 0;
        int soma = 0;
        do {
            Scanner ler = new Scanner(System.in);
            System.out.println("Insira um número: ");
            int num = ler.nextInt();
            if (num > maior) maior = num;
            soma = num + soma;
            contador ++;
        }while (contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
