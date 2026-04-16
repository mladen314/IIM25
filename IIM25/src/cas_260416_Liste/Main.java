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
		int n=sc.nextInt();
		ArrayList<Integer> brojevi = new ArrayList<>();
		int a;
		
		for(int i=0; i<n; i++) {
			a=sc.nextInt();
			brojevi.add(a);
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
		
	}
}
