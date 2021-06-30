package construtor;
import java.util.Scanner;
/**
 *
 * @author lipe_
 */
public class HabilitacaoMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scan.nextLine();
        System.out.println("Digite seu ano de nascimento");
        int anoNascimento = scan.nextInt();
        if (anoNascimento <= 2003){
            Motorista motorista = new Motorista(nome, anoNascimento);
            String entrada;
            System.out.println("Escolha o tipo de habilitação\nA) Moto\nB) Carro\nZ) Moto e carro");
            entrada = scan.next();
            char tipoCNH = entrada.toUpperCase().charAt(0);
            motorista.setTipoCNH(tipoCNH);
            System.out.println("Seu nome " + motorista.getNome());
            System.out.println("Seu ano de Nascimento " + motorista.getAnoNascimento());
            System.out.println("Sua CNH " +  motorista.getTipoCNH());
        } else {
            System.out.println("Você não tem idade para dirigir ainda");
        }
    }
    
}