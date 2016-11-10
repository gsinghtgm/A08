package gruppe2;

public class Flaeche implements IFlaeche {
	double flaeche;

	public Flaeche(double a, double b, double c) {
		flaeche = Math.sqrt(((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4);
	}

	public Flaeche(double a, double b) {
		flaeche = a * b;
	}

	public Flaeche(double a) {
		flaeche = a * a * Math.PI;
	}

	@Override
	public double getFlaeche() {
		return flaeche;
	}

}
