package cas_260129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti cijeli broj");
		int a = input.nextInt();
		
		System.out.println("Suma cifara broja "+a+" je "+suma_cifara(a));
		
	}
	
	/*
	 * Funkcija koja vraca sumu cifara
	 */
	
	public static int suma_cifara(int n) {
		int sum=0;
		if(n<0) {
			n=-n;
		}
		while(n>0){
			sum+=n%10;
			n/=10;
		}
		
		return sum;
	}
	
	
	/*
	 * Vraca otpornost broja koja se racuna kao broj transformacija da se dobije
	 * jednocifren broj, broj se transformise u sumu svojih cifara.
	 */

}
