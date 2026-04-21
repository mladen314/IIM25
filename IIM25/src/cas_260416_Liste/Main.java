package cas_260416_Liste;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		//ArrayList
		//LinkedList
		//Integer Boolean Double
//		ArrayList<String> ucenici = new ArrayList<>();
//		ucenici.add("Andrej");
//		ucenici.add(1,"Aleksandar");
//		System.out.println(ucenici.get(1));
//		ucenici.set(1, "Milo");
//		System.out.println(ucenici.get(1));
//		System.out.println(ucenici);
//		ucenici.add("Aleksa");
//		ucenici.sort(null);
//		System.out.println(ucenici);
//		ucenici.remove(0);

		Scanner sc = new Scanner(System.in);
/*		Zadatak 1
 
		int n=sc.nextInt();
		ArrayList<Integer> brojevi = new ArrayList<>();
		int a;
		
		for(int i=0; i<n; i++) {
			a=sc.nextInt();
			brojevi.add(a);
		}
		
		maxBroj(brojevi);
		suma(brojevi);
		
		makniNeparne(brojevi);
		
		maxBroj(brojevi);
		suma(brojevi); */
		
/* Zadatak 2: Napraviti program koji kreira listu imena i omogucava korisniku da:
		1 - unese ime
		2 - provjeriti da li se ime nalazi u listi
		3 - ukloniti ime (ako postoji)
		4 - stampati listu i zavrsiti program */
		
/*		int n;
		ArrayList<String> imena = new ArrayList<>();
		String s;
		
		while(true) {
			System.out.println("1 - Unijeti ime");
			System.out.println("2 - Provjera imena");
			System.out.println("3 - Izbrisati ime");
			System.out.println("4 - Stampati listu i zavrsiti program");
			
			n = sc.nextInt();
			
			if(n==1) {
				s=sc.next();
				imena.add(s);
			}else if(n==2) {
				s=sc.next();
				if(imena.contains(s)) {
					System.out.println("Unijeto ime se nalazi u listi.");
				}else {
					System.out.println("Unijeto ime se ne nalazi u listi.");
				}
			}else if(n==3) {
				s=sc.next();
				imena.remove(s);
			}else if(n==4) {
				System.out.println(imena);
				break;
			}else {
				System.out.println("Pogresan unos.");
			}
		}*/
		
/* Zadatak 3: Unijeti prirodan broj n i n prirodnih brojeva u listu. Od tih brojeva, napraviti
		listu sa prostim i listu sa slozenim brojevima */
		
		int n=sc.nextInt();
		ArrayList<Integer> brojevi = new ArrayList<>();
		int a;
		
		for(int i=0; i<n; i++) {
			a=sc.nextInt();
			brojevi.add(a);
		}
		ArrayList<Integer> prosti = new ArrayList<>();
		ArrayList<Integer> slozeni = new ArrayList<>();
		
		for(int i=0; i<brojevi.size(); i++) {
			if(isPrime(brojevi.get(i))) {
				prosti.add(brojevi.get(i));
			}else {
				slozeni.add(brojevi.get(i));
			}
		}
		
	}
	
	public static void maxBroj (ArrayList<Integer> lista) {
		int max = lista.get(0);
		for(int i=1; i<lista.size(); i++) {
			if(lista.get(i)>max) {
				max=lista.get(i);
			}
		}
		System.out.println(max);
	}
	
	public static void suma (ArrayList<Integer> lista) {
		int s=0;
		for(int i=0; i<lista.size(); i++) {
			s=s+lista.get(i);
		}
		System.out.println(s);
	}
	
	public static ArrayList<Integer> makniNeparne (ArrayList<Integer> lista){
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i)%2==1) {
				lista.remove(i);
				i--;
			}
		}
		return lista;
	}
	
	public static boolean isPrime (int a) {
		for(int i=2; i<=Math.sqrt(a); i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}
