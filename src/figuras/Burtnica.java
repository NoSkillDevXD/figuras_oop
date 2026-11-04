package figuras;

import javax.swing.JOptionPane;

public class Burtnica {
	
	private Cetrsturis[] cetrsturis = new Cetrsturis[1];

	public static void main(String[] args) {
		new Burtnica().sakt();
	}
	
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
				
				if (atbilde == 0) {
	            	cIevade();
				} else {
					break;
				}
	        }
		}	
		
		private void cIevade() {
			try {
				int x = Integer.parseInt(JOptionPane.showInputDialog
						("Ievadi centra X koordinātu: "));
				
				int y = Integer.parseInt(JOptionPane.showInputDialog
						("Ievadi centra Y koordinātu: "));
				
				int platums = Integer.parseInt(JOptionPane.showInputDialog
						("Ievadi četrstūra platumu: "));
				
				int augstums = Integer.parseInt(JOptionPane.showInputDialog
						("Ievadi četrstūra augstumu: "));
				
				Centrs centrs = new Centrs(x, y);
				
				//jaunis četrstūris aizstāj veco ja ievadi jauno četrstūri
				cetrsturis[0] = new Cetrsturis(centrs, platums, augstums);
				
				Cetrsturis c = cetrsturis[0];
				
				//parāda visu info par četrstūri
				JOptionPane.showMessageDialog(null, "Četrstūra info: "
						+ "\nPlatums: " + c.platums
						+ "\nAugstums: " + c.augstums
						+ "\nLaukums: " + c.cLaukums()
						+ "\n" + c.punkts.izvaditKoordinatas());
				
				//parvietošana x un y centra punktam
				int parvietot = JOptionPane.showConfirmDialog(null, "Pārvietot centra punktu?",
				"Centra punktu pārvietošana", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if (parvietot == JOptionPane.YES_NO_CANCEL_OPTION) {
					
					int parvX = Integer.parseInt(JOptionPane.showInputDialog
					("Ievadi centra X pārvietojumu: "));
					int parvY = Integer.parseInt(JOptionPane.showInputDialog
					("Ievadi centra Y pārvietojumu: "));
					
					c.punkts.parvietot(parvX, parvY);
					
					JOptionPane.showMessageDialog(null,
					"Koordinātas: " + c.punkts.izvaditKoordinatas());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
			"Ievadi veselus skaitļus!!!");
		}
	}
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