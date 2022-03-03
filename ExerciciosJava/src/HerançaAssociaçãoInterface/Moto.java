public class Moto extends Veiculo{
    @Override
    void metodo1(){
        System.out.println("Metodo1 da classe filha Moto");
    }
    @Override
    void metodo2(){
        System.out.println("Metodo2 da classe filha Moto");
    }
    //Exemplo de associação
    Motor motor;
}
