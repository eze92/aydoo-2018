package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {

	
	
	public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.agregarAzucar(cantidadAzucar);
		unVaso.getCantidadDeAzucar();
		
	}

	public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		boolean unTe = true;
		unVaso.agregarAzucar(cantidadAzucar);
		unVaso.getCantidadDeAzucar();
		unVaso.agregarTe(unTe);
		unVaso.tieneTe();
		

	}


}
