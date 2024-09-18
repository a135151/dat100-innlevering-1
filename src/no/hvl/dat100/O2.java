package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		
		String innTekt = showInputDialog("Din inntekt for 2024: ");
		double persinntekt = Double.parseDouble(innTekt);
		double skatt = 0;
		double trinn1 = (292851 - 208051) * 0.017;
		double trinn2 = (670000 - 292851) * 0.04;
		double trinn3 = (937900 - 670000) * 0.136;
		double trinn4 = (135000 - 937901) * 0.166;
		
        if (persinntekt >= 208051 && persinntekt <= 292850) {
            skatt = (persinntekt * 0.017);
        } else if (persinntekt >= 292851 && persinntekt <= 670000) {
            skatt = trinn1 + ((persinntekt - 292851) * 0.04);
        } else if (persinntekt >= 670001 && persinntekt <= 937900) {
            skatt = trinn1 + trinn2 + ((persinntekt - 670001) * 0.136);
        } else if (persinntekt >= 937901 && persinntekt <= 1350000) {
            skatt = trinn1 + trinn2 + trinn3 + ((persinntekt - 937901) * 0.166);
        } else if (persinntekt > 1350000) {
            skatt = trinn1 + trinn2 + trinn3 + trinn4 + ((persinntekt - 1350001) * 0.176);
        }
        showMessageDialog(null, "Din skatt for 2024: " + skatt);
        System.out.println("Din skatt for 2024: " + skatt);
		}

	}


