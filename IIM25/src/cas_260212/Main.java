package cas_260212;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unijeti recenicu:");
		String s = input.nextLine();
		System.out.println(brise_suvisne_razmake(s));
		System.out.println(br_samoglasnika(s));
		
	}
	
	/*
	 * Napisati funkciju koja iscisti string od suvisnih space-ova.
	 * Ako string ima dupli space onda umjesto njega stavlja 
	 * samo jedan
	 */
	
	public static String brise_suvisne_razmake(String s) {
		
		while(s.contains("  ")) {
			s = s.replace("  ", " ");
		}
		
		return s;
	}
	
	
	/*
	 * Napisati funkciju koja prebrojava samoglasnike (a, e, o, i, u)
	 */
	
	public static int br_samoglasnika(String s) {
		String sam = "AEOIUaeoui";
		int br=0;
		for (int i = 0; i < s.length(); i++) {
			String karakter = s.substring(i, i+1); // uzima i-ti karakter kao string
			if(sam.contains(karakter)) {
				br++;
			}
		}
		return br;
	}
	
	
	/*
	 * Napisati funkciju koja provjerava da li je sifra jaka. 
	 * Sifra se smatra jakom ako sadrzi barem 8 karaktera
	 * od kojih su barem dva cifre i barem dva specijalni karakteri
	 * ($, %, !, _) i barem 4 slova engleskog alfabeta od kojih je 
	 * barem jedno veliko
	 */

}
