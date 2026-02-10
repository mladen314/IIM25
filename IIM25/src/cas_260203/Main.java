package cas_260203;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char x = 'a';
		String s = "Algoritmi", s1= "algoritmi", s2;
		String gim = "Gimnazija\n \"Slobodan Skerovic\"";
		
		System.out.println("Unijeti dvije linije teksta");
		//s = input.nextLine(); // unosti citav red, do entera
		//s2 = input.next();  // unosi jednu rijec, do prvog space-a
		
		System.out.println(s.charAt(5));
		System.out.println(s.length());
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf("i", 6));
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println("Aleksa".compareTo("Ana")<0);
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));
		//System.out.println(gim);
		

	}

}
