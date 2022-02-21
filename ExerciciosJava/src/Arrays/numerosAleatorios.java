/**
 * Faça um programa que leia 20 números inteiros aleatórios(entre 0 e 100)armazene-os em um vetor.
 * Ao final, mostre os números e seus sucessores
 */

import java.util.Arrays;
import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 101;
        int [] lista = new int[20];

        for (int i = 0; i < lista.length; i++){
            int num = rand.nextInt(max);
            lista[i] = num;
        }
        System.out.println(Arrays.toString(lista));
        int [] listaSucessores = new int[20];

        for (int j = 0; j < listaSucessores.length; j++){
            int pos = lista[j] + 1;
            listaSucessores[j] = pos;
        }
        System.out.println(Arrays.toString(listaSucessores));
    }
}
