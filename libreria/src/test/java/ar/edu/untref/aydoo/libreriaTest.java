package ar.edu.untref.aydoo;

import org.junit.Test;


import junit.framework.Assert;

public class libreriaTest {

	@SuppressWarnings("deprecation")
	@Test
	public void definirProducto() {
		Producto unProducto = new Producto();
		int precio = 30;
		unProducto.agregarPrecio(precio);
		Assert.assertEquals(30,unProducto.getPrecio());
		
	}
	@Test
	public void definirCliente() {
		Producto unProducto = new Producto();
		Cliente unCliente = new Cliente("juan","perez","caseros",unProducto);
		Assert.assertEquals("juan", unCliente.getNombre());
		Assert.assertEquals("perez", unCliente.getAPellido());
		Assert.assertEquals("caseros", unCliente.getDireccion());
		
	}
}
