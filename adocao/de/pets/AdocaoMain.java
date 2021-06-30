package adocao.de.pets;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lipe_
 */
public class AdocaoMain {

    public static void main(String[] args) {   
        
        Scanner scan = new Scanner(System.in);
        
        Pet pet1 = new Pet("Bob", "PitBull", 2015, 'M');
        Pet pet2 = new Pet("Claudia", "Husk Siberiano", 2020, 'F');
        Pet pet3 = new Pet("Usop", "Rottweiler", 2007, 'M');
        Pet pet4 = new Pet("Bunny", "poodle", 2013, 'F');
        
        ArrayList<Pet> petsAdocao = new ArrayList<Pet>();
        petsAdocao.add(pet1);
        petsAdocao.add(pet2);
        petsAdocao.add(pet3);
        petsAdocao.add(pet4);
        
        Pessoa pessoa1 = new Pessoa("Filipe", "08155698744", 2000);
        
        int escolha;
        System.out.println("Bem vindo ao sistema de adoção de pets");
        do{
            System.out.println("1) Adotar pet\n");
            System.out.println("2) Listar pets adotados\n");
            System.out.println("3) Listar pets restantes\n");
            System.out.println("4) Sair\n");
            
            escolha = scan.nextInt();
            if(escolha == 1) realizarAdocao(pessoa1, petsAdocao, scan);
            else if(escolha == 2) listarPetsAdotados(pessoa1);
            else if(escolha == 3) listarPetsRestantes(petsAdocao);
            else System.out.println("Muito obriado por usar nosso sistema, bye bye");
            
        } while (escolha != 4);
        
    }
    
    private static void realizarAdocao(Pessoa pessoa, ArrayList<Pet> petsAdocao, Scanner entrada) {
        System.out.println("Informe qual pet deseja adotar: ");
        for (int i = 0; i < petsAdocao.size(); i++) {
            System.out.println(i + " - " + petsAdocao.get(i).getInfoPet());
        }
        int numeroPet = entrada.nextInt();
        Pet candidato = petsAdocao.get(numeroPet);
        if (pessoa.adotarPet(candidato) == true) {
            System.out.println("Pet " + numeroPet + " adotado com sucesso!\n");
            petsAdocao.remove(candidato);
        } else {
            System.out.println("Você já adotou o máximo de pets permitidos!\n");
        }
    }
    
    private static void listarPetsAdotados(Pessoa pessoa) {
        System.out.println("\nPets adotados até o momento: ");
        System.out.println(pessoa.listarPets());
    }
    
    private static void listarPetsRestantes(ArrayList<Pet> petsAdocao) {
        System.out.println("\nPets restantes para adoção: ");
        for (Pet p : petsAdocao) {
            System.out.println(p.getInfoPet() + "\n");
        }
    }

}