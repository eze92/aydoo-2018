package ar.edu.untref.aydoo;

public class Bote {

	private int longitud ;
	private Posicion[][] posiciones;
	private boolean esAgua;
	//private Tablero tablero;
	
	 public Bote() {
	        this.posiciones = new Posicion[10][10];
	        for (int i = 0; i < posiciones.length; i++) {
	            for (int j = 0; j < posiciones.length; j++) {
	                this.posiciones[i][j] = new Posicion(i, j);
	            }
	        }
	 }
	public void atacarPosicion(Posicion posicion) {
		this.posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()].setEsAgua(false);		
	}

	public boolean getResultadoDeAtaqueVacio() {
		return this.esAgua == true;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		
	}
	public Posicion getPosicionAtaque(Posicion posicion) {
		return posiciones[posicion.getPosicionHorizontal()][posicion.getPosicionVertical()];
	}

	public int getLongitud() {
		return this.longitud;		
	}
	public boolean getResultadoDeAtaqueAcertado(Posicion posicion,Tablero tablero) { 
		if(getPosicionAtaque(posicion) == tablero.getPosicionDeBote(posicion)) {
			return true;
		}else  {			
		return false;
	}

	}
}
