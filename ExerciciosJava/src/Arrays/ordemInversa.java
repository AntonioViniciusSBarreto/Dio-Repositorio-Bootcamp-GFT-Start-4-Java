/**
 * Faça um programa que lei um vetor de 5 números inteiros e
 * mostre-os na ordem inversa
 */


import java.util.Arrays;
import java.util.Scanner;

public class ordemInversa {
    public static void main(String[] args) {
        int [] lista = new int[5];

        for (int i = 0; i < 5; i++){
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite um número: ");
            lista[i] = ler.nextInt();
        }

        for (int j = lista.length - 1; j >= 0; j--){
            System.out.println(Arrays.toString(lista));
        }

    }


}
