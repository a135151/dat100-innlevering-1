package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		String innTxt = showInputDialog("Skriv inn et heltall større enn 0: ");
		int n = Integer.parseInt(innTxt);
		int fakultet = 1;
		
		for (int i = 1; i <=n; i++) {
			fakultet *= i;
		
		}
		System.out.println(n + "! = " + fakultet);
	}
}
