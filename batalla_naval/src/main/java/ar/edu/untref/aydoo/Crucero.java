package ar.edu.untref.aydoo;

public class Crucero {

	private int longitud;
	private Posicion[][] posiciones;
	private boolean esAgua;
	
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return this.longitud;
		
	}

	public void atacarPosicion(Posicion posicion) {
		
	}

	public boolean getResultadoDeAtaqueVacio() {
		return this.esAgua == true;
	}

}
