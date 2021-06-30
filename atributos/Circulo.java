package atributos;

/**
 *
 * @author lipe_
 */
public class Circulo {
    private double raio;
    private static double pi;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double getArea(){
        double area = Math.pow(this.raio, 2) * Circulo.pi;
        return area;
    }
    public double getCircunferencia(){
        double circunferencia = 2 * this.raio * Circulo.pi;
        return circunferencia;
    }
    
    public static void setPi(double pi){
        Circulo.pi = pi;
    }
}