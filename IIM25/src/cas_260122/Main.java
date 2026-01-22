package cas_260122;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti dva cijela broja");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int s = suma(a, b);	
		System.out.println("Suma brojeva je: " + s);
	}
	
	/* 
	 * Funkcija koja vraca zbir dva broja koji se predaju kroz argumente 
	 */
	public static int suma(int n, int m) {
		int s = n+m;
		return s;
	}
}
