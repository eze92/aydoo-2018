package ar.edu.untref.aydoo;

public class Crucero {

	private int longitud;
	private Posicion[][] posiciones;
	private boolean esAgua;
	
	 public Crucero() {
	        this.posiciones = new Posicion[10][10];
	        for (int i = 0; i < posiciones.length; i++) {
	            for (int j = 0; j < posiciones.length; j++) {
	                this.posiciones[i][j] = new Posicion(i, j);
	            }
	        }
	 }
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return this.longitud;
		
	}

	public void atacarPosicion(Posicion posicion) {
		this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].setEsAgua(true);		
	}

	public boolean getResultadoDeAtaqueVacio() {
		return this.esAgua == true;
	}

}