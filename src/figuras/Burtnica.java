package figuras;

import javax.swing.JOptionPane;

public class Burtnica {

	public static void main(String[] args) {
		new Burtnica().sakt();
	}
		/*Centrs centraP1 = new Centrs(0, 101);
		JOptionPane.showMessageDialog(null, "Pirmā punkta koordinātas: "
		+ centraP1.izvaditKoordinatas(), "Infomrācija",
		JOptionPane.PLAIN_MESSAGE);
		
		//2. Metode
		centraP1.parvietot(5, -51);
		
		JOptionPane.showMessageDialog(null, "Pirmā punkta koordinātas: "
		+ centraP1.izvaditKoordinatas(), "Infomrācija",
		JOptionPane.PLAIN_MESSAGE);
		
		//1. Konstrukotors
		Cetrsturis c1 = new Cetrsturis();
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
		+ c1.augstums + "\nplatums: " + c1.platums + "\ncentra punkts: " + c1.punkts.izvaditKoordinatas());
		
		//2. Konstruktors
		Cetrsturis c2 = new Cetrsturis(centraP1);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
		+ c2.augstums + "\nplatums: " + c2.platums + "\ncentra punkts: " + c2.punkts.izvaditKoordinatas());
		
		//3. Konstruktors
		Cetrsturis c3 = new Cetrsturis(10, 8);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
		+ c3.augstums + "\nplatums: " + c3.platums + "\ncentra punkts: " + c3.punkts.izvaditKoordinatas());
		
		//4. Konstruktors
		Cetrsturis c4 = new Cetrsturis(centraP1, 10, 8);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
		+ c4.augstums + "\nplatums: " + c4.platums + "\ncentra punkts: " + c4.punkts.izvaditKoordinatas());
		*/
		/*Izvēlas vienuno figūrām un realizē vērtību ievadi
		no JOptionPane logiem, nodrošina objekta izveidi un
		tā metožu izsaukšanu ievadot komandas
		Nodrošināt vairāku objektu uzglabāšanu (masīvā)
		*/
		
		public void sakt() {
			String[] izveles = {
					"Četrstūris",
					"Beigt"
			};
			
			while(true) {
				String teksts = "Izvēlies darbību\n\n";
				
				int atbilde = JOptionPane.showOptionDialog(null,
						teksts, "Ievade", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
						null, izveles, izveles[0]);
				
				if (atbilde == 0) 
	            	cIevade();
	            else break;
				
	        }
		}	
		
		private void cIevade() {
			Centrs centraP1 = new Centrs(0,0);
			JOptionPane.showInputDialog(null, "Pirmā punkta koordinātas: "
			+ centraP1.izvaditKoordinatas(), "Infomrācija",
			JOptionPane.PLAIN_MESSAGE);
			
			
		
				
		}
}
