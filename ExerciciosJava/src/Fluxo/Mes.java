/** 
 * Enunciado 
 * Com if, exiba o nome do mês do ano de acordo com seu número.
 * Evite o efeito "flecha". Faça também outro if que verifique se o 
 * mês é julho, dezembro ou janeiro, para assim exibir o texto
 * "Férias"
 */


import java.util.Scanner;
public class Mes{
    public static void IfMes() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número do mês atual: ");
        int mes = ler.nextInt();
        if (mes == 1) {
            System.out.println("Janeiro");
        }else if(mes == 2){
            System.out.println("Fevereiro");
        }else if(mes == 3){
            System.out.println("Março");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Maio");
        }else if(mes == 6){
            System.out.println("Junho");
        }else if(mes == 7){
            System.out.println("Julho");
        }else if(mes == 8){
            System.out.println("Agosto");
        }else if(mes == 9){
            System.out.println("Setembro");
        }else if(mes == 10){
            System.out.println("Outubro");
        }else if(mes == 11){
            System.out.println("Novembro");
        }else if(mes == 12){
            System.out.println("Dezembro");
        }
        if (mes == 1 || mes == 7 || mes == 12) {
             System.out.println("Férias");
        }
        ler.close();
    }
}
   



  



