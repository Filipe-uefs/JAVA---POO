package atributos;

/**
 *
 * @author lipe_
 */
public class Quadrado {
    private double lado;
    private static double diagonal;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    public double getArea(){
        return this.lado * this.lado;
    }
    public double getPerimetro(){
        return this.lado *  4;
    }
    public double getDiagonal(){
        return this.lado * Quadrado.diagonal;
    }
    
    public static void setDiagonal(double diagonal){
        Quadrado.diagonal = diagonal;
    }
}