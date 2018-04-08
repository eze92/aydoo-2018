package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestBatallaNaval {


    @Test
    public void ponerBoteEnTablero() {

        Bote unBote = new Bote();
        Tablero unTablero = new Tablero();
        Posicion posicion = new Posicion(1, 1);

        unTablero.ponerBote(unBote, posicion);

        Assert.assertFalse(unTablero.estaDisponible(posicion));

    }

    @Test
    public void tableroVacioTodasLasPosicionesLibres() {

        Tablero unTablero = new Tablero();
        Posicion posicion = new Posicion(1, 1);

        Assert.assertTrue(unTablero.estaDisponible(posicion));

    }
    @Test
    public void ponerCruceroEnTablero() {
    	Crucero unCrucero = new Crucero();
    	Tablero unTablero = new Tablero();
    	Posicion posicion = new Posicion(2,2);
    	unTablero.ponerCrucero(unCrucero,posicion);   	
    	Assert.assertFalse(unTablero.estaDisponible(posicion));
    	
    	
    }
    @Test
    public void boteAtacaAUnaPosicionVacia() {
    	Bote unBote = new Bote();
    	Posicion posicion = new Posicion(3,4);
    	unBote.atacarPosicion(posicion);
    	Assert.assertFalse(unBote.getResultadoDeAtaqueVacio());
    	}
    	
    @Test 
    public void establerLongitudDelBote() {
    	Bote unBote = new Bote();
    	int longitud = 1;
    	unBote.setLongitud(longitud);
    	unBote.getLongitud();
    	Assert.assertEquals(1, unBote.getLongitud());
    } 	
    
    @Test
    public void establecerLongitudDelCrucero() {
    	Crucero unCrucero = new Crucero();
    	int longitud = 2;
    	unCrucero.setLongitud(longitud);
    	unCrucero.getLongitud();
    	Assert.assertEquals(2, unCrucero.getLongitud());
    }
    @Test
    public void CruceroAtacaAUnaPosicionVacia() {
    	Crucero unCrucero = new Crucero();
    	Posicion posicion = new Posicion(3,3);
    	unCrucero.atacarPosicion(posicion);
    	Assert.assertFalse(unCrucero.getResultadoDeAtaqueVacio());
    }
    
   
}


