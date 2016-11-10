package gruppe2;

public class rauminhalt implements IRaumInhalt {
	private double rauminhalt;
	/**
	 * zylinder
	 * @param radius
	 * @param h�he
	 */
	public rauminhalt(double radius, double hoehe) {
		Flaeche f = new Flaeche(radius);
		rauminhalt=f.getFlaeche()*hoehe;
	}

	/**
	 * quader
	 * @param l�nge
	 * @param breite
	 * @param h�he
	 */
	public rauminhalt(double laenge, double breite, double hoehe) {
		Flaeche f = new Flaeche(laenge,breite);
		rauminhalt = f.getFlaeche()*hoehe;
	}

	/**
	 * 
	 * @param h�he
	 * @param a
	 * @param b
	 * @param c
	 */
	public rauminhalt(double hoehe, double a, double b, double c) {
		Flaeche f = new Flaeche(a,b,c);
		rauminhalt = f.getFlaeche()*hoehe;
	}

	public double getRaumInhalt() {
		return rauminhalt;
	}
}
