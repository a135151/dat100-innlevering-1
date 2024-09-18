package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {
	
	public static void main(String[] args) {

		final int antallElever = 10;

		for (int i = 1; i <= antallElever; i++) {
			String poengTxt = showInputDialog("Skriv inn antall poeng: ");
			int poeng = Integer.parseInt(poengTxt);
			String karakter = "";
			if (poeng <= 100 && poeng >= 90) {
			karakter = "A";
		} else if (poeng <= 89 && poeng >= 80) {
			karakter = "B";
		} else if (poeng <= 79 && poeng >= 60) {
			karakter = "C";
		} else if (poeng <= 59 && poeng >= 50) {
			karakter = "D";
		} else if (poeng <= 49 && poeng >= 40) {
			karakter = "E";
		} else if (poeng <= 39 && poeng >= 0) {
			karakter = "F";
		} else {
			showMessageDialog(null,"Ugyldig poengsum");
			System.out.println("Ugyldig poengsum");
		}
			System.out.println("Student " + i + " Karakter: " + karakter);
			showMessageDialog(null,"Karakter: " + karakter);
		}
	}
}