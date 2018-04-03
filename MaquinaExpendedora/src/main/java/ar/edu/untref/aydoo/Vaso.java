package ar.edu.untref.aydoo;

public class Vaso {


	int cantidadAzucar;
	boolean cafe;
	boolean te;
	
	public void Vaso() {
	}
	
	public void agregarAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
	public int getCantidadDeAzucar() {
		return this.cantidadAzucar;
	}
	public boolean tieneAzucar() {
		if (this.cantidadAzucar > 0){
			return true;
		}
		return false;
	}
	public void agregarTe(boolean unTe) {
		this.te = unTe;
	}

	public boolean tieneTe() {
		 return this.te;
  }

}
