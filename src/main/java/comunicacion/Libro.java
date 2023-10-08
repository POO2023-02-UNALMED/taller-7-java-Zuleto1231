package comunicacion;

public class Libro extends Escrito {
	private String co_editorial;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas,String co_editorial, String editorial, String edicion, String interpretacion ) {
		super( origen,  titulo,  autor,  paginas);
		this.co_editorial=co_editorial;
		this.editorial=editorial;
		this.edicion=edicion;
		this.interpretacion=interpretacion;
		
	}
	
	public  int palabrasTotales(int paginasTotales) {
		return this.getPaginas() * paginasTotales*2 ;
	}
	
	public String interpretacion() {
		return this.interpretacion;
		
	}
	
	public String toString() {
		return this.resumen() + "\n" + this.co_editorial + "\n" + this.editorial + "\n" + this.edicion;
	}

	
//	Getters and Setters
	public String getCo_editorial() {
		return co_editorial;
	}

	public void setCo_editorial(String co_editorial) {
		this.co_editorial = co_editorial;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

	
	
	

	

}
