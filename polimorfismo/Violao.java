package polimorfismo;

public class Violao extends InstrumentoMusical{

	public Violao() {
		super("Violao", TipoInstrumento.CORDA);
	}
	
	@Override
	public String afinar() {
		return "Afinando Violao";
	}
	
	@Override 
	public String tocar(String cancao) {
		return "Tocando " + cancao + " com violao";
		
	}
}