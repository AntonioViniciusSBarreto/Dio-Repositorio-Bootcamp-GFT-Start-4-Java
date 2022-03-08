/**
 *Faça um programa que receba a temperatura média dos 6
 * primeiros messes do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e
 * mostre todas as temperaturas acima desta média, e em que
 * m~es elas ocorreram (mostrar o mês por extenso: 1 - Janeiro,
 * 2 - Fevereiro e etc)
 */



import java.util.*;

public class TemperaturaMensal {

    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        int cont = 0;
        do {
            System.out.println("Informe a temperatura média do mês " + (cont + 1) +": ");
            temperaturas.add(scan.nextDouble());
            cont++;

        }while (cont < 6);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        double media = soma/temperaturas.size();
        System.out.println("Média de temperaturas do primeiro semestre: "+ media);

        System.out.println("===Meses em que a temperatura foi acima da média===");
        for (double temperatura:temperaturas) {
            if (temperatura > media){
                int posicao = temperaturas.indexOf(temperatura);
                switch (posicao){
                    case 0:
                        System.out.println("1-Janeiro: " + temperatura);
                        break;
                    case 1:
                        System.out.println("2-Fevereiro: " + temperatura);
                        break;
                    case 2:
                        System.out.println("3-Março: " + temperatura);
                        break;
                    case 3:
                        System.out.println("4-Abril: " + temperatura);
                        break;
                    case 4:
                        System.out.println("5-Maio: " + temperatura);
                        break;
                    case 5:
                        System.out.println("6-Junho: " + temperatura);
                        break;
                }
            }
        }

    }
}

