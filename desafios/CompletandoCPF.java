package desafios;

import java.util.Scanner;

public class CompletandoCPF {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe os 9 primeiros dígitos do CPF (apenas números): ");
        String digitos = teclado.next();
        int[] cpf = converterStringParaVetorInt(digitos);
        cpf = descobrirUltimosNumeros(cpf);
        // descobrir os dois últimos dígitos e colocá-los na variável cpf

        System.out.println("CPF completo: " + converterVetorIntParaString(cpf));
    }
    
    // Esta função converte o CPF (os 9 dígitos informados na entrada) de String para um vetor de int
    // Também insere dois 0 no fim, para completar os 11 dí­gitos de um CPF
    // Ex.: "963852741" vira [9, 6, 3, 8, 5, 2, 7, 4, 1, 0, 0]
    static int[] descobrirUltimosNumeros(int[] cpf) {
    	int[] aux = {10, 9, 8, 7, 6, 5, 4, 3, 2};
    	int resultado, d=0, resto;
    	for(int x=0;x<9;x++) {
    		resultado = cpf[x] * aux[x];
    		d += resultado;
    	}
    	resto = d%11;
    	if (resto==1 || resto==0) {
    		cpf[9] = 0;
    	} else {
    		cpf[9] = 11 - resto;
    	}
    	d = 0;
    	for(int x=1;x<10;x++) {
    		resultado = cpf[x] * aux[x-1];
    		d += resultado;
    	}
    	resto = d%11;
    	if (resto==1 || resto==0) {
    		cpf[10] = 0;
    	} else {
    		cpf[10] = 11 - resto;
    	}
    	return cpf;
    }
    static int[] converterStringParaVetorInt(String cpfString) {
        int[] cpfNumerico = new int[11];
        for (int i = 0; i < cpfString.length(); i++) {
            cpfNumerico[i] = Character.getNumericValue(cpfString.charAt(i));
        }
        return cpfNumerico;
    }
    
    // Esta função converte o CPF de vetor de int (usado nos cálculos) para String
    // Ex.: [9, 6, 3, 8, 5, 2, 7, 4, 1, 2, 8] vira "96385274128"
    static String converterVetorIntParaString(int[] cpfNumerico) {
        String cpfString = "";
        for (int i = 0; i < cpfNumerico.length; i++) {
            cpfString += Integer.toString(cpfNumerico[i]);
        }
        return cpfString;
    }

}