package cas_251211;

import java.util.Scanner;

public class Main {
	/*********************** main ************************/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti jedan prirodan broj: ");
		int x = input.nextInt();
		sumaCifara(x);
		
		input.close();

	}
	/*********************** sumaCifara ************************/
	public static void sumaCifara(int n) {
		int s=0;
		while(n>0) {
			s=s+n%10;
			n=n/10;
		}
		System.out.println("Suma cifara unesenog broja je "+s);
	}
	/**********************************************************/
	

}
