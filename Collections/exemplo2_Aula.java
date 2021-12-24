package Collections;

public class exemplo2_Aula {

	private String titulo;
	private int tempo;
	
	public exemplo2_Aula(String x, int n) {
		this.titulo=x;
		this.tempo=n;
	}
	
	public String toString() {
		return "Aulas: "+this.titulo+", "+this.tempo+"min";
	}

}
