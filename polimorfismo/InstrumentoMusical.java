package polimorfismo;

public abstract class InstrumentoMusical {
	private String name;
	private TipoInstrumento tipo;
	
	public InstrumentoMusical(String name, TipoInstrumento tipo) {
		this.name = name;
		this.tipo = tipo;
	}
	
	public abstract String afinar();
	public abstract String tocar(String cancao);
}