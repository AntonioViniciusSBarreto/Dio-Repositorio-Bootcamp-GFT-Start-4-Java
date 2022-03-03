public class Caminhao extends Veiculo{
    @Override
    void metodo1(){
        System.out.println("Metodo1 da classe filha Caminhao");
    }
    @Override
    void metodo2(){
        System.out.println("Metodo2 da classe filha Caminhao");
    }

    //Exemplo de associação
    Motor motor;
}
