public class AreaQuadrilatero {
    public static double calculoArea(double lado1, double lado2) {
        double area = lado1 *lado2;
        return area;
    }
    public static Float calculoArea(Float altura, Float largura) {
        Float area = altura * largura;
        return area ;
    }
    public static Double calculoArea(double baseMenor, double baseMaior, double altura ) {
        Double area =(baseMenor + baseMaior) * altura / 2;
        return area ;
    }

}   