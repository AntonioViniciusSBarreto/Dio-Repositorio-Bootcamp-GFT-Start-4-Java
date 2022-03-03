public class MainInterface implements OperacaoMatematica {

    @Override
    public void soma(int operando1, int operando2){
        System.out.println("Soma: " + (operando1 + operando2));
    }

    @Override
    public void subtracao(int operando1, int operando2){
        System.out.println("Subtração: " + (operando1 - operando2));
    }

    public void multiplicacao(double operando1, double operando2){
        System.out.println("Multiplicação: " + (operando1 * operando2));
    }

    public void divisao(double operando1, double operando2){
        System.out.println("Divisão: " + (operando1 / operando2));
    }

}
