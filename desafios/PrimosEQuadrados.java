package desafios;

import java.util.Scanner;

public class PrimosEQuadrados {
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int numberInt;
    	do {
    		System.out.println("Digite um número natural");
    		String number = scanner.next();
    		numberInt = numeroNatural(number);
    	} while (numberInt == 0);
    	for(int x=1;x<numberInt;x++) {
    		if (numeroPrimo(x)) System.out.printf("Número %d é primo\n", x);
    		if (quadradoPerfeito(x)) System.out.printf("Número %d é um quadrado perfeito\n", x);
    	}
    	
    }
    
    private static boolean numeroPrimo(int numero) {
    	int count = 0;
        for(int x=2;x<=numero;x++) {
        	if(numero%x==0) count++;
        } 
        
        return (count < 2) && (numero != 1);
    }
    
    private static boolean quadradoPerfeito(int numero) {
    	return (numero%Math.sqrt(numero) == 0);
    }
    
    private static int numeroNatural(String entrada) {
        for (char caractere : entrada.toCharArray()) {
            if (!Character.isDigit(caractere)) return 0;
        }
        return Integer.parseInt(entrada);
    }

}