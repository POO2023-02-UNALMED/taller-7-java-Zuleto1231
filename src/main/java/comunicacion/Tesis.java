package comunicacion;


public class Tesis extends Escrito {
	private String idea;
	private  static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super( origen,  titulo,  autor,  paginas);
		this.idea=idea;
		Tesis.argumentos=argumentos;
		this.conclusion=conclusion;
		this.referencias=referencias;
		this.interpretacion=interpretacion;
		
	}
	
	public  int palabrasTotales(int palabrasPagina) {
		return this.getPaginas()* palabrasPagina * 5;
		
	}
	
	public String interpretacion() {
		return this.interpretacion;
		
	}
	
	public String toString() {
		int contador=0;
		for (int i =0;i< Tesis.argumentos.length;i++) {
			if (Tesis.argumentos[i] != null) {
				contador+=1;
			}}

		
		return this.resumen() + "\n" + this.idea + "\n" + contador + "\n" + this.conclusion + "\n" + this.referencias;
	}
	
	
	
//	Getters and Setters
	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
