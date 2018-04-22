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
}
