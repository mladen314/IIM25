package projekatJovanaFilipovic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Integer> slucajniBrojevi = new ArrayList<Integer>();
		
		popuniBrojevima(slucajniBrojevi, 10);
		
		ArrayList<Integer> prostiBrojevi = new ArrayList<Integer>();
		ArrayList<Integer> slozeniBrojevi = new ArrayList<Integer>();
		
		razvrstajProsteiSlozene(slucajniBrojevi, prostiBrojevi, slozeniBrojevi);
		
		ispisiBrojeve(slucajniBrojevi, prostiBrojevi, slozeniBrojevi);
		
	}
	
	public static void popuniBrojevima(ArrayList<Integer> lista, int brojClanova) {
		Random random = new Random();
		for(int i=0; i<brojClanova; i++) {
			lista.add(random.nextInt(99)+2);
		}
	}
	
	public static boolean jeProst(int n) {
		if (n<2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	
	public static void razvrstajProsteiSlozene(ArrayList<Integer> sviBrojevi, ArrayList<Integer> prosti, ArrayList<Integer> slozeni) {
		for (int i = 0; i < sviBrojevi.size(); i++) {
			int broj = sviBrojevi.get(i);
			
			if (jeProst(broj)) {
				prosti.add(broj);
			} else {
				slozeni.add(broj);
			}
		}
	}
	
	public static void ispisiBrojeve(ArrayList<Integer> sviBrojevi, ArrayList<Integer> prosti, ArrayList<Integer> slozeni) {
		System.out.println("Svi nasumični brojevi: ");
		System.out.println(sviBrojevi);
		System.out.println("***");
		
		if(!prosti.isEmpty()) {
			System.out.println("Prosti brojevi:");
			System.out.println(prosti);
			System.out.println("Najveci prost broj: " + Collections.max(prosti));		
			System.out.println("Najmanji prost broj: " + Collections.min(prosti));	

		}  else {
			System.out.println("Nema prostih brojeva");
		}
		
		System.out.println("***");
		
		if (!slozeni.isEmpty()) {
			System.out.println("Složeni brojevi: ");
			System.out.println(slozeni);
			System.out.println("Najveci slozeni broj: " + Collections.max(slozeni));
			System.out.println("Najmanji slozeni broj: " + Collections.min(slozeni));
		} else {
			System.out.println("Nema slozenih brojeva");
		}
		
		
	}
	

}
