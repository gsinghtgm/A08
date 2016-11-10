package gruppe2;

public class Rauminhalt implements IRaumInhalt {
	private double rauminhalt;
	/**
	 * Hier wird das Volumen vom Zylinder berechnet
	 * @author Mirza Kurtalic
	 * @param radius
	 * @param höhe
	 * @version 10.11
	 */
	public Rauminhalt(double radius, double hoehe) {
		Flaeche f = new Flaeche(radius);
		rauminhalt=f.getFlaeche()*hoehe;
	}

	/**
	 * Hier wird das Volumen vom Quader berechnet
	 * @param länge
	 * @param breite
	 * @param höhe
	 * @since 10.11
	 */
	public Rauminhalt(double laenge, double breite, double hoehe) {
		Flaeche f = new Flaeche(laenge,breite);
		rauminhalt = f.getFlaeche()*hoehe;
	}

	/**
	 * Hier wird das Volumen vom Prisma berechnet
	 * @param höhe
	 * @param a
	 * @param b
	 * @param c
	 * @since 10.11
	 */
	public Rauminhalt(double hoehe, double a, double b, double c) {
		Flaeche f = new Flaeche(a,b,c);
		rauminhalt = f.getFlaeche()*hoehe;
	}

	public double getRaumInhalt() {
		return rauminhalt;
	}
}
