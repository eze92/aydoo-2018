package ar.edu.untref.aydoo;

public class Vaso {


	int cantidadAzucar;
	boolean cafe;
	boolean te;
	
	public void Vaso() {
	}
	
	//Metodo para agregar azucar
	public void agregarAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
	//Metodo que devuelve la cant. azucar agregado
	public int getCantidadDeAzucar() {
		return this.cantidadAzucar;
	}
	//Metodo para comprobar si tiene azucar
	public boolean tieneAzucar() {
		if (this.cantidadAzucar > 0){
			return true;
		}
		return false;
	}

	//Metodo para agregar Cafe
	public void agregarCafe(boolean unCafe) {
			this.cafe = unCafe;
		}	
	
	//Metodo que devulve valor de la variable cafe
	public boolean tieneCafe() {
			return this.cafe;
	}

	//Metodo para agregar Te
	public void agregarTe(boolean unTe) {
		this.te = unTe;
	}
	//Metodo que devulve valor de la variable te
	public boolean tieneTe() {
		 return this.te;
  }


}
