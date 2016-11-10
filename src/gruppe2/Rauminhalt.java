package gruppe2;

public class Rauminhalt implements IRaumInhalt {
	private double rauminhalt;
	/**
	 * zylinder
	 * @param radius
	 * @param höhe
	 */
	public Rauminhalt(double radius, double hoehe) {
		Flaeche f = new Flaeche(radius);
		rauminhalt=f.getFlaeche()*hoehe;
	}

	/**
	 * quader
	 * @param länge
	 * @param breite
	 * @param höhe
	 */
	public Rauminhalt(double laenge, double breite, double hoehe) {
		Flaeche f = new Flaeche(laenge,breite);
		rauminhalt = f.getFlaeche()*hoehe;
	}

	/**
	 * 
	 * @param höhe
	 * @param a
	 * @param b
	 * @param c
	 */
	public Rauminhalt(double hoehe, double a, double b, double c) {
		Flaeche f = new Flaeche(a,b,c);
		rauminhalt = f.getFlaeche()*hoehe;
	}

	public double getRaumInhalt() {
		return rauminhalt;
	}
}
