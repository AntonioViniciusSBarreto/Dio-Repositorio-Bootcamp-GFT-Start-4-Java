

import java.util.Scanner;

/**
 * Enunciado
 * Faça um programa que leia o conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare inserindo o valor 0 no campo nome)
 */

public class noms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Nome: ");
            String nome = scan.next();
            if (nome.equals("0"))break;
            System.out.print("Idade: ");
            int idade = scan.nextInt();
        }
    }
}