package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	Forma forma;

	/**
	 * Toda Mano debe crearse con una forma dada, que será la que determine su
	 * condición en el juego.
	 * 
	 * @param forma,
	 *            la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas del juego.
	 * 
	 * @param otra,
	 *            la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		Resultado vector[] = new Resultado[5];
		int base = this.forma.getValor();
		vector[base] = Resultado.EMPATA;
		for (int i = 1; i < 3; i++) {
			vector[(base + i) % 5] = Resultado.PIERDE;
		}
		for (int i = 3; i < 5; i++) {
			vector[(base + i) % 5] = Resultado.GANA;
		}
		return vector[otra.forma.getValor()];
	}
}
