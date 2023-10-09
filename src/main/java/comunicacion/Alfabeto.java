package comunicacion;




public class Alfabeto extends Pictograma{
	private static String[] letras;
	private String interpretacion;
	
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	
	
	public int  cantidadLetras() {
		int contador=0;
		for (int i =0;i< Alfabeto.letras.length;i++) {
			if (Alfabeto.letras[i] != null) {
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
		
		for (int i=0; i< Alfabeto.letras.length; i++) {
			if (Alfabeto.letras[i]!=null) {
			todasLasLetras+=Alfabeto.letras[i]+", ";
			}
		}
		String ultimaComa=todasLasLetras.substring(0,todasLasLetras.length()-2);
		return ultimaComa;
		
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
