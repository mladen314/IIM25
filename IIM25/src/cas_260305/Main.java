package cas_260305;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int [] niz;
		System.out.println("Unijeti duzinu niza: ");
		
		System.out.println(slucajanBr(100, 900));
		
		
	}
	//Math.random() - slucajan broj iz intervala od 0 do 1
	
	public static int slucajanBr(int m, int n) {
		return (int)(Math.random()*(n-m))+m;
	}

}
