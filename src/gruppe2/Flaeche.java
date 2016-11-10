package gruppe2;

public class Flaeche implements IFlaeche {
	/**
	 * @author Gurparkash Singh
	 * @since 10-11-2016
	 */
	private double flaeche;

	/**
	 * Konstruktor f�r Dreieckfl�che.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public Flaeche(double a, double b, double c) {
		flaeche = Math.sqrt(((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4);
	}

	/**
	 * Konstruktor f�r Rechteckfl�che.
	 * 
	 * @param a
	 * @param b
	 */
	public Flaeche(double a, double b) {
		flaeche = a * b;
	}

	/**
	 * Konstruktor f�r Kreisfl�che.
	 * 
	 * @param a
	 */
	public Flaeche(double a) {
		flaeche = a * a * Math.PI;
	}

	@Override
	public double getFlaeche() {
		return flaeche;
	}

}
