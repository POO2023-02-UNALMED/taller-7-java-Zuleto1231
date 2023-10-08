package comunicacion;




public class Alfabeto extends Pictograma{
	private String[] letras= new String[100];
	private String interpretacion;
	
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	
	
	public int  cantidadLetras() {
		return this.letras.length;
	}
	
	public String interpretacion() {
		return this.interpretacion;
		
	}
	
	public String toString() {
		String todasLasLetras="";
		for (int i=0; i< this.letras.length; i++) {
			todasLasLetras+=this.letras[i]+", ";
		}
		return todasLasLetras;
		
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
