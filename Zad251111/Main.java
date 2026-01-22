package Zad251111;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		/*
		 * Stampa sumu neparnih brojeva manjih od n
		 * 
		 */
		int n, s=0;
		System.out.println("Unijeti prirodan broj:");
		n=input.nextInt();
		for (int i = 1; i < n; i+=2) {
			s=s+i;  // s+=i;
		}
		
		System.out.println("Suma je: "+s);

	}

}
