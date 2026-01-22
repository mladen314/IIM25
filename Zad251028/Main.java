package Zad251028;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Stampa da li je uneseni broj pozitivan 
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		int a;
		
		System.out.println("Unijeti cijeli broj");
		a = input.nextInt();
		
		if(a>0) {
			System.out.println("Uneseni broj je pozitivan");
		}else if(a<0){
			System.out.println("Uneseni broj je negativan");
		}else {
			System.out.println("Uneseni broj je jednak nuli");
		}
		
		/*
		 * Za uneseni broj stampa njegovu apsolutnu vrijednost
		 */
		
		System.out.println("Drugi zadatak");
		System.out.println("Unijeti cijeli broj");
		a = input.nextInt();
		int x= a;
		if(x<0) {
			x=-x;
		}
		System.out.println("|"+a+"|="+x);
		
		
		

	}

}
