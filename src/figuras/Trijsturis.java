package figuras;

import javax.swing.JOptionPane;

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
	
	public double tLaukums() {
		double a, b, c;
		a = distance(punktiX[0], punktiY[0], punktiX[1], punktiY[1]);
		b = distance(punktiX[1], punktiY[1], punktiX[2], punktiY[2]);
		c = distance(punktiX[2], punktiY[2], punktiX[0], punktiY[0]);
		
		if(a < b + c && b < a + c && c < a + b) {
			double p = (a + b + c) / 2;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c));
			
		} else {
			JOptionPane.showMessageDialog(null,
					"No nogriežniem: a = " + a + 
					"\nb = " + b + 
					"\nc = " + c + 
					"\n trijstūri izveidot nevar!", "Brīdinājums",
					JOptionPane.ERROR_MESSAGE);
			return 0;
		}
	}
	
	double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
