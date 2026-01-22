package Zad251021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stampa da li radnja radi ako znamo da je radno vrijeme
		 * od 8h do 20h sa pauzom od 12h do 14h
		 */
		Scanner input = new Scanner(System.in);
		int t;
		
		System.out.println("Unijeti vrijeme:");
		t = input.nextInt();
		
		boolean radi = (t>=8&&t<=12)||(t>=14&&t<=20);
		System.out.println("Radi: "+radi);
		
		input.close();
		
	}

}
