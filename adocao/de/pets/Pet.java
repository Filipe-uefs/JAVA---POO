package adocao.de.pets;

/**
*
* @author lipe_
*/
public class Pet {
   private String nome;
   private String raca;
   private int anoNascimento;
   private char sexo;
   
   Pet(String nome, String raca, int anoNascimento, char sexo){
       this.nome = nome;
       this.raca = raca;
       this.anoNascimento = anoNascimento;
       this.sexo = sexo;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public String getRaca(){
       return this.raca;
   }
   
   public int getAnoNascimento(){
       return this.anoNascimento;
   }
   
   public char getSexo(){
       return this.sexo;
   }
   
   public String getInfoPet(){
       String infoPet = "Nome: " + this.nome +
               "\nRaça: " + this.raca + 
               "\nAno Nasc.: " + this.anoNascimento + 
               "\nSexo: " + this.sexo;
       
       return infoPet;
   }
}