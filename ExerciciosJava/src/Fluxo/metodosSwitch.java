/**
 * Enunciado
 * Com switch use String para  a partir do dia da semana, exiber seu
 * número. Ainda no switch, faça outro exemplo onde, se uma 
 * váriavel inteira for entre 1 e 3 exibir o texto "Certo".Se for 4 
 * exibir "Errado", se for 5 "Talvez". Para demais valores exibir "Valor
 * indefinido" 
 */

import java.util.Scanner;

public class metodosSwitch {
    public static void diaDaSemana() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Que dia é hoje? ");
        String dia = ler.nextLine();

        switch (dia) {
            case "Segunda":
                System.out.println(1);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(3);
                break;
            case "Quinta":
                System.out.println(4);
                break;
            case "Sexta":
                System.out.println(5);
                break;
            case "Sábado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
            default:
                break;
        }
        ler.close();
    }
    public static void numero() {
        Scanner lerNumero = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = lerNumero.nextInt();

        switch (numero) {
            case 2:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
        lerNumero.close();
    }
}
