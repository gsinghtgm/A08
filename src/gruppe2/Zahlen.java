package gruppe2;
/**
 * Mit dieser Klasse wird das Minimum und das Maximum ermittelt.
 * Ausserdem wird die Summe berechnet.
 * 
 * @author Elshal
 * @version 10.11.2016
 */
public class Zahlen implements IZahlen {
	private double minimum = 100; //minimum wird auf 100 gesetzt, damit die erste kleinere Zahl, diesen Platz einnehmen kann
	private double maximum = -100; //maximum wird auf -100 gesett, damit die erste groessere Zahl, diesen Platz einnehmen kann
	private double summe; // die Summe der Zahlen
	/**
	 * Konstruktor der Zahlen-Klasse
	 * Ermittelt das Minimum und das Maximum
	 * @param min das potenzielle Minimum
	 * @param max das potenzielle Maximum
	 * @since 10.11.2016
	 */
	public Zahlen(double min, double max) {
		if (min < minimum)
			this.minimum = min;

		if (max > maximum)
			this.maximum = max;
	}
	/**
	 * Get-Methode für die Summe
	 * @return Gibt die Summe der Zahlen zurück
	 * @since 10.11.2016
	 */
	@Override
	public double getSumme() {
		return summe;
	}
	/**
	 * Get-Methode für das Minimum
	 * @return Gibt das Minimum der Zahlen zurück
	 * @since 10.11.2016
	 */
	@Override
	public double getMinimum() {
		return minimum;
	}
	/**
	 * Get-Methode für das Maximum
	 * @return Gibt das Maximum der Zahlen zurück
	 * @since 10.11.2016
	 */
	@Override
	public double getMaximum() {
		return maximum;
	}
	/**
	 * Addiert eine Zahl zu der Summe
	 * Diese Zahl wird mit dem Konstruktor geprüft, ob sie ein neues minimum oder maximum ist.
	 * @since 10.11.2016
	 */
	@Override
	public void add(double value) {
		summe += value;
		new Zahlen(value, value);
	}
}
