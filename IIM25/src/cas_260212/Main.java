package cas_260212;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unijeti recenicu:");
		String s = input.nextLine();
		System.out.println(brise_suvisne_razmake(s));
		
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
	
	
	
	/*
	 * Napisati funkciju koja provjerava da li je sifra jaka. 
	 * Sifra se smatra jakom ako sadrzi barem 8 karaktera
	 * od kojih su barem dva cifre i barem dva specijalni karakteri
	 * ($, %, !, _)
	 */

}
