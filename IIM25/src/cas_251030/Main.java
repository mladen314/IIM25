package cas_251030;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * provjerava da li je broj paran
		 */
		
		Scanner input = new Scanner(System.in);
		int x;
		
		System.out.println("Unijeti cijeli broj:");
		x=input.nextInt();
		
		if(x%2==0) {
			System.out.println("Broj je paran");
		}else {
			System.out.println("Broj je neparan");
		}
		
		/*
		 * Provjeriti da li je broj Armstrongov 
		 * trocifren broj je armstrongov ukoliko je jednak 
		 * zbiru kubova svojih cifara
		 */
		
		int a, c1, c2, c3;
		c1=x%10;
		c2=(x%100)/10;
		c3=x/100;
		a= c1*c1*c1+c2*c2*c2+c3*c3*c3;
		
		if(x==a) {
			System.out.println("Broj "+x+" je armstrongov!");
		}else {
			System.out.println("Broj "+x+" nije armstrongov!");
		}
		

	}

}
