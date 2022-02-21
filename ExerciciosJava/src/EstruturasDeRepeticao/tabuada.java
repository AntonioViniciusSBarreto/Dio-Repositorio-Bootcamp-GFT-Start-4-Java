/**
 * Enunciado
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer outro número inteiro entre 1 a 10.
 * O usuário dece informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o  exemplo abaxio:
 *
 * Tabuada do 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o  número da tabuada que deseja ver: ");
        int numEscolhido = ler.nextInt();

        System.out.println("Tabuada do "+numEscolhido);

        for (int i=1;i < 11; i++){
            System.out.println(numEscolhido + " x " + i + " = " + (numEscolhido*i));
        }
    }
}
