package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	Mano jugadorUno = new Mano(Forma.SPOCK);
	Mano jugadorDos = new Mano(Forma.PIEDRA);
	Mano jugadorTres = new Mano(Forma.PAPEL);
	Mano jugadorCuatro = new Mano(Forma.TIJERA);
	Mano jugadorCinco = new Mano(Forma.LAGARTO);

	@Test
	public void spock() {
		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorCuatro));
		assertEquals(Resultado.PIERDE, jugadorUno.jugarCon(jugadorTres));
		assertEquals(Resultado.PIERDE, jugadorUno.jugarCon(jugadorCinco));
		assertEquals(Resultado.EMPATA, jugadorUno.jugarCon(jugadorUno));
	}
	
	@Test
	public void piedra() {
		assertEquals(Resultado.PIERDE, jugadorDos.jugarCon(jugadorUno));
		assertEquals(Resultado.EMPATA, jugadorDos.jugarCon(jugadorDos));
		assertEquals(Resultado.PIERDE, jugadorDos.jugarCon(jugadorTres));
		assertEquals(Resultado.GANA, jugadorDos.jugarCon(jugadorCuatro));
		assertEquals(Resultado.GANA, jugadorDos.jugarCon(jugadorCinco));
	}

}
