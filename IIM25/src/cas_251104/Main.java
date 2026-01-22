package cas_251104;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		float s;
		
		System.out.println("Unijeti ocjenu iz matematike:");
		a = input.nextInt();
		System.out.println("Unijeti ocjenu iz fizike:");
		b = input.nextInt();
		System.out.println("Unijeti ocjenu iz hemije:");
		c = input.nextInt();
		System.out.println("Unijeti ocjenu iz informatike:");
		d = input.nextInt();
		
		s = (float)(a+b+c+d)/4;
		s = (float)(Math.round(s*100))/100;
		System.out.println("Uspjeh: "+s);
		
		if(s>=4.5) {
			System.out.println("Ucenik je odlican.");
		} else if(s>=3.5) {
			System.out.println("Ucenik je vrlo dobar.");
		} else if(s>=2.5) {
			System.out.println("Ucenik je dobar.");
		} else {
			System.out.println("Ucenik je dovoljan.");
		}

	}

}
