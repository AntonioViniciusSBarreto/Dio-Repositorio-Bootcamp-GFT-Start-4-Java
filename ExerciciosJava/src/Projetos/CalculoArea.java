/**
 * A Formula para calcular a área de um circunferência é: Area = pi * raio^2.
 * Considerando para este problema que pi = 3.14159.
 *
 * Efetue o cálculo da área elevenando o valor de raio ao quadrado e
 * multiplicando por pi
 *
 * ENTRADA
 *
 * A entrada contém um valor de ponto flutuante(dupla precisão), no
 * caso, a variável raio
 *
 * SAIDA
 *
 * Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme,
 * o exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis
 *  de dupla precisão(double). Como todos os problemas, não esqueça de
 *  imprimir o fim de linha após o resultado, caso contrário, você receberá
 *  "Presentation Error"
 *
 *  Exemplo
 *
 *  Entrada: 2.00 Saida: A=12.5664
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class CalculoArea {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.0000");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do raio em até duas casasa decimais: ");
        double raio = ler.nextDouble();

       double area =3.14159  * Math.pow(raio,2);

       System.out.println("A=" + formatador.format(area) + "\n");

    }
}
