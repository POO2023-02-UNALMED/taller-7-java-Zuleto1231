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
		int contador=0;
		for (int i =0;i< this.letras.length;i++) {
			if (this.letras[i] != null) {
				contador+=1;
			}
		}
		return contador;
	}
	
	
	public String interpretacion() {
		return this.interpretacion;
		
	}
	
	public String toString() {
		String todasLasLetras="";
		for (int i=0; i< this.letras.length; i++) {
			if (this.letras[i]!=null) {
			todasLasLetras+=this.letras[i]+", ";
			}
		}
		return todasLasLetras;
		
	}

	
//	Getters y setters
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
