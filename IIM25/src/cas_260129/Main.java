package cas_260129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti cijeli broj");
		int a = input.nextInt();
		int n = 3;
		System.out.println("Suma cifara broja "+a+" je "+suma_cifara(a));
		System.out.println("Otpornost broja "+a+" je "+otpornost_broja(a));
		System.out.println("Najmanji broj otpornosti "+n+" je "+broj_otpornosti_n(n));
	}
	
	/*
	 * Funkcija koja vraca sumu cifara
	 */
	
	public static int suma_cifara(long n) {
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
	 * Vraca otpornost broja koja se racuna kao broj transformacija 
	 * da se dobije jednocifren broj, broj se transformise u 
	 * sumu svojih cifara.
	 */
	
	public static int otpornost_broja(long x) {
		int otp = 0;
		while(x>9) {
			otp++;
			x=suma_cifara(x);
		}
		return otp;		
	}
	
	/*
	 * Vraca prvi prirodni broj sa otpornoscu n
	 */
	
	public static long broj_otpornosti_n(int n) {
		long br=1;
		while(otpornost_broja(br)<n) {
			br++;
		}
		return br;
	}

}
