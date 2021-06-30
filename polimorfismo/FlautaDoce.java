package polimorfismo;

public class FlautaDoce extends InstrumentoMusical{

	public FlautaDoce() {
		super("Flauta Doce", TipoInstrumento.SOPRO);
	}
	
	@Override
	public String afinar() {
		return "Reencaixando a flauta para a afinação!";
	}
	
	@Override 
	public String tocar(String cancao) {
		return "Tocando " + cancao + " com flauta doce";
		
	}
}