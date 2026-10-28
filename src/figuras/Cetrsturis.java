package figuras;

public class Cetrsturis {
	public int platums, augstums;
	public Centrs punkts;
	
	// Konstruktoru pārslogošana
	
	//1. Konstruktors
	public Cetrsturis() {
		punkts = new Centrs(0, 0);
		platums = 4;
		augstums = 6;
	}
	
	//2. Konstruktors
	public Cetrsturis(Centrs p) {
		punkts = p;
		platums = 2;
		augstums = 3;
	}
	
	//3. Konstruktors
	public Cetrsturis(int platums, int augstums) {
		punkts = new Centrs(-5, 5);
		this.platums = platums;
		this.augstums = augstums;
	}
	
	//4. Konstruktors
	public Cetrsturis(Centrs p, int platums, int augstums) {
		punkts = p;
		this.platums = platums;
		this.augstums = augstums;
	}
	
	public int cLaukums() {
		return platums * augstums;
	}
}
