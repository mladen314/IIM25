package cas_251016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		boolean a, b;
		
		a = 5>10; // >, <, >=, <=, == 
		
		b = 10==15;
		
		System.out.println(a);
		System.out.println(b);
		
		/*
		 * Provjerava da li skola radi (da li je od 8 do 20h)
		 */
		int t;
		System.out.println("Unijeti vrijeme");
		t=input.nextInt();
		boolean radi;
		
		radi = t>=8 && t<=20;  //   && -> AND      || ->  OR  
		
		System.out.println("Skola radi: "+radi);
		
	}

}
