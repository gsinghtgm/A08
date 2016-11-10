package gruppe2;

public class Zahlen implements IZahlen {
	private double minimum = 100;
	private double maximum = -100;
	private double summe;

	public Zahlen(double min, double max) {
		if (min < minimum)
			this.minimum = min;

		if (max > maximum)
			this.maximum = max;
	}

	@Override
	public double getSumme() {
		return summe;
	}

	@Override
	public double getMinimum() {
		return minimum;
	}

	@Override
	public double getMaximum() {
		return maximum;
	}

	@Override
	public void add(double value) {
		summe += value;
		new Zahlen(value, value);
	}
}
