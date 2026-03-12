package cas_260305;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int [] niz;
		System.out.println("Unijeti duzinu niza: ");
		int n = input.nextInt();
		//niz = kreirajNiz(n);
		niz = new int[n];
		popuniNiz(niz);
		stampajNiz(niz);
		
		//System.out.println(slucajanBr(100, 900));
		
		input.close();
		
	}
	//Math.random() - slucajan broj iz intervala od 0 do 1
	
	public static int slucajanBr(int m, int n) {
		
		if(m>n) {
			int pom = m;
			m = n;
			n = pom;
		}
		return (int)(Math.random()*(n-m))+m;
	}
	
	public static void stampajNiz(int [] niz) {
		for (int element : niz) {
			System.out.print(element + " ");
			element = slucajanBr(10, 20);
		}
		System.out.println();
	}
	
	public static int[] kreirajNiz(int n) {
		int [] niz = new int[n];
		
		for (int i = 0; i < niz.length; i++) {
			niz[i] = slucajanBr(10, 100);
		}
		return niz;
	}
	
	public static void popuniNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			niz[i] = slucajanBr(10, 100);
		}
	}
	
	/*
	 * Napisati funkciju koja provjerava
	 * da li se zadati element alazi u nizu
	 */
	
	
	/*
	 * Napisati funkciju koja varaca najveci
	 * element niza
	 */
	

}
