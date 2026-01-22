package cas_251023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		/*
		 * Stampa poruku "Radnja radi" ukoliko je otvorena radnja (8-12 i 14-20h)
		 * ukoliko ne radi radnja stampa poruku "Radnja ne radi"
		 */

		int t;
		System.out.println("Unijeti vrijeme (int):");
		t = input.nextInt();

		if ((t >= 8 && t <= 12) || (t >= 14 && t <= 20)) {
			System.out.println("Radnja radi");
		} else {
			System.out.println("Radnja ne radi");
		}

	}

}
