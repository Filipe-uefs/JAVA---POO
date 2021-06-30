package adocao.de.pets;

import java.util.ArrayList;
/**
 *
 * @author lipe_
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private int anoNascimento;
    private ArrayList<Pet> petsAdotados = new ArrayList<Pet>();
    private final static int MAXIMO_PETS = 2;
    
    Pessoa(String nome, String cpf, int anoNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }
    
    public boolean adotarPet(Pet pet){
        if(this.anoNascimento < 2003 && petsAdotados.size() < Pessoa.MAXIMO_PETS){
            petsAdotados.add(pet);
            return true;
        }
        return false;
    }
    
    public String listarPets(){
        String listOfPets = "";

        for(Pet thisPet: petsAdotados){
            listOfPets = listOfPets + thisPet.getInfoPet() + "\n";
        }
        return listOfPets;
    }
    
}