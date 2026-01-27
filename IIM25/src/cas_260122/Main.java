package cas_260122;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti dva cijela broja");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(sumaJeProstBr(a, b)) {
			System.out.println("Suma brojeva "+a+" i "+b+" JESTE prost broj");
		}
		else {
			System.out.println("Suma brojeva "+a+" i "+b+" NIJE prost broj");
		}
		
		
	}
	
	/* 
	 * Funkcija koja vraca zbir dva broja koji se predaju kroz argumente 
	 */
	public static int suma(int n, int m) {
		int s = n+m;
		return s;
	}
	
	/*
	 * Provjerava da li je broj prost
	 */
	public static boolean jeProstBroj(int n) {
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	/*
	 * Provjerava da li je suma cifara prost broj
	 */
	public static boolean sumaJeProstBr(int a, int b) {
		
		int s = suma(a, b);
		boolean jeste = jeProstBroj(s);
		return jeste;
		
		//return jeProstBroj(suma(a, b));
		
	}
	
	
}
