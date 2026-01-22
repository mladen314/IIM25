package cas_251120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		/*
		 * za unijeti broj provjerava koliko ima cifara
		 */
		
		System.out.println("Unijeti prirodan broj: ");
		int x = input.nextInt();
		int br_cif = 0;
		
		while(x>0) {
			br_cif++;
			x/=10;   // x=x/10;
		}
		

	}

}
