package gruppe2;

public class Zahlen implements IZahlen {
	private double minimum;
	private double maximum;
	private double summe;
	
	public Zahlen(double zahl1, double zahl2){
		if(zahl1 < zahl2){
			this.minimum =zahl1;
			this.maximum = zahl2;
		}else{
			this.minimum = zahl2;
			this.maximum = zahl1;
		}
		
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
		double s = summe+ value;
	}

}
