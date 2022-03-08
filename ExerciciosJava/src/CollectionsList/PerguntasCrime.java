/**
 * Utilizando listas, faça um programa que faça 5 perguntas para uma
 * pessoa sobre um crime. As perguntas são:
 * 1-"Telefonou para a vítima?"
 * 2-"Esteve no local do crime?"
 * 3-"Mora perto da vítima?"
 * 4-"Devia para a vítima?"
 * 5-"Já trabalhou com a vítima?"
 *
 * Se a pessoa responder positivamente a 2 questões ela deve ser
 * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
 * "Assassina". Caso contrário, ela será classificada como "Inocente"
 */


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PerguntasCrime {
    public static void main(String[] args) {
        List<String> perguntas = Arrays.asList("Telefonou para a vítima?",
                                                "Esteve no local do crime?",
                                                "Mora perto da vítima?",
                                                "Devia para a vítima?",
                                                "Já trabalhou com a vítima?" );

        System.out.println("Agora você responderá uma serie de perguntas relacionadas\n" +
                            "a vítima do crime de sua denúncia.Responda:\n" +
                            "1 - Sim\n" +
                            "2 - Não\n");

        int cont = 0;
        Iterator<String> iterator = perguntas.iterator();
        Scanner resposta = new Scanner(System.in);
        int res;
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            res = resposta.nextInt();
            if(res==1) cont++;
        }
        if (cont == 2){
            System.out.println("Suspeito");
        }else if(cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        }else{
            System.out.println("Inocente");
        }

    }
}
