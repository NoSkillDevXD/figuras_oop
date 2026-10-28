package figuras;

public class Aplis {
	private double radiuss;
	public Centrs punkts;
	
	public Aplis(Centrs punkts, double radiuss) {
		this.punkts = punkts;
		this.radiuss = radiuss;
	}
	
	// Riņķa līnijas garums
	public double rLGarums() {
		return 2 * Math.PI * radiuss;
	}
	
	// Riņķa laukumu
	public double rLaukums() {
		return Math.PI * Math.pow(radiuss, 2);
	}
}
