package atributos;

/**
 *
 * @author lipe_
 */
public class GeometriaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado.setDiagonal(1.41);
        Quadrado newQuadrado = new Quadrado(2.5);
        System.out.println("Informações sobre o quadrado de área 2.5 a diagonal0 1.4");
        System.out.printf("A area do quadrado é %.3f cm2 %n",newQuadrado.getArea());
        System.out.printf("O perimetro do quadrado é %.3f cm %n",newQuadrado.getPerimetro());
        System.out.printf("O diagonal do quadrado é %.3f cm %n",newQuadrado.getDiagonal());
        Quadrado.setDiagonal(Math.sqrt(2));
        System.out.printf("A nova area da diagonal é %.3f cm %n",newQuadrado.getDiagonal());
        
        System.out.println("\n\nInformações sobre o ciruclo");
        Circulo.setPi(3.14);
        Circulo newCirculo = new Circulo(2.5);
        System.out.printf("A area do circulo é %.3f cm2 %n",newCirculo.getArea());
        System.out.printf("A circunferencia do circulo é %.3f cm %n",newCirculo.getCircunferencia());
        Circulo.setPi(Math.PI);
        System.out.printf("A area do circulo é %.3f cm2 %n",newCirculo.getArea());
        System.out.printf("A circunferencia do circulo é %.3f cm %n",newCirculo.getCircunferencia());
        
    }
    
}