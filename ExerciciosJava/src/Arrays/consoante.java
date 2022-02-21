/**
 * Faça um programa que leia um vetor que lê 6 caracteres e diga quantas consoantes foram lidas.
 * Imprima as consoantes
 */

import java.util.Scanner;

public class consoante {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] consoantes = new String[6];

        int qtdConsoantes = 0;
        int cont = 0;

        do {
            System.out.println("Letra: ");
            String letra = ler.next();

            if (!(letra.equalsIgnoreCase("a")||
                letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i"))||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u")){

                consoantes[cont] = letra;
                qtdConsoantes++;
            }
            cont++;

        }while (cont < consoantes.length);

        for (String consoante : consoantes ) {
            if (consoante != null)
            System.out.println(consoante + " ");
        }
    }
}
