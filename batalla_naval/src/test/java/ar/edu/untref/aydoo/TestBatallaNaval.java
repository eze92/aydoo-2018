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
    	Posicion posicion = new Posicion(3,3);
    	unBote.atacarPosicion(posicion);
    	Assert.assertTrue(unBote.getResultadoDeAtaqueVacio(posicion.esAgua()));
    	}
    	
    }


