package ar.edu.untref.aydoo;

public class Bote {

	private int longitud ;
	private Posicion posicion;
	private boolean esAgua;
	
	public void atacarPosicion(Posicion posicion) {
		// TODO Auto-generated method stub
		
	}

	public boolean getResultadoDeAtaqueVacio() {
		return this.esAgua == true;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		
	}

	public int getLongitud() {
		return this.longitud;
		// TODO Auto-generated method stub
		
	}

}
