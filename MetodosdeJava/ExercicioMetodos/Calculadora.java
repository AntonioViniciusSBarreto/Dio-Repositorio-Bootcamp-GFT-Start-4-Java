package MetodosdeJava.ExercicioMetodos;

public class Calculadora{
    
    public static void soma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("A soma desses números é: " + resultado);
    }
    
    public static void subtracao(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("A subtração desses números é: "+ resultado);
    }
    
    public static void multiplicacao(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("A s desses números é: "+ resultado);
    }
    
    public static void divisao(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("A divisão desses números é: "+ resultado);
    }
}