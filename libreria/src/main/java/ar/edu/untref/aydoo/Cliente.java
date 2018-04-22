package ar.edu.untref.aydoo;

public class Cliente {

	String nombre;
	String apellido;
	String direccion;
	
	public Cliente(String nombre, String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getAPellido() {
		return this.apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void comprar_Producto(Producto unProducto) {
		// TODO Auto-generated method stub
		
	}

}
