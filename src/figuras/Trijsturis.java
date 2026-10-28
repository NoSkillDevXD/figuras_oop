package figuras;

public class Trijsturis {
	private int[] punktiX = new int[3];
	private int[] punktiY = new int[3];  //1 = 3,4 ; 2 = 5,5 ; 3 = 7,-4
	private Centrs p;
	
	public Trijsturis(Centrs p, int[] punktiX, int[] punktiY) {
		this.p = p;
		for(int i = 0; i < punktiX.length; i++) {
			this.punktiX[i] = punktiX[i];
			this.punktiY[i] = punktiY[i];
		}
		
	}
	/*
	public double tLaukums() {
		double a, b, c;
		a = distance(punktiX[0], punktiY[0], punktiX[1], punktiY[1]);
	}
	
	double distance(int x1, int y1, int x2, int y2) {
		
		return //Jāizdomā kā noteikt distanci
	}*/
}
