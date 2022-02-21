/**
 * Enunciado
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
 * pedindo até que o usuário informe o valo válido.
 */

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        while (true) {
            Scanner ler = new Scanner(System.in);
            System.out.print("Insira uma nota de 0 a 10: ");
            int nota = ler.nextInt();
            if (nota < 0 || nota > 10)
                System.out.print("Valor inválido!\n");
                continue;
        }
    }
}


