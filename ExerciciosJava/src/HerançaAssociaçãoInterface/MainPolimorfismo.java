public class MainPolimorfismo {
    public static void main(String[] args) {
        Veiculo[] classes = new Veiculo[]{new Caminhao(), new Carro(), new Moto(), new Veiculo()};

        for (Veiculo classe: classes){
            classe.metodo1();
        }

        System.out.println(" ");

        for (Veiculo classe: classes){
            classe.metodo2();
        }

        System.out.println(" ");

       Caminhao caminhao = new Caminhao();
       caminhao.metodo2();
    }
}
