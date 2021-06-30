package construtor;

/**
 *
 * @author lipe_
 */
public class Motorista {
    private String nome;
    private int anoNascimento;
    private char tipoCNH;
    
    public Motorista(String nome, int anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.tipoCNH = '-';
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getAnoNascimento(){
        return this.anoNascimento;
    }
    
    public char getTipoCNH(){
        return this.tipoCNH;
    }
    public char setTipoCNH(char tipoCNH){
        System.out.println(tipoCNH);
        if(tipoCNH != 'A' || tipoCNH != 'B' || tipoCNH != 'Z'){
            return 'F';
        }
        this.tipoCNH = tipoCNH;
        return this.tipoCNH;
    }
}