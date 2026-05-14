package projekatAglajaKilina;

import java.util.*;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer>brojevi = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ukucajte koliko brojeva zeliste unesti");
		
		int x = input.nextInt();				
		for (int i = 0; i < x; i++) {
			
			int broj = input.nextInt();
			brojevi.add(broj);
		}

		System.out.println("Vi ste ukucali: " + brojevi);
		ArrayList<Integer>brojevibezponavljanja = listabezponavljanja(brojevi);
		System.out.println("Vasa lista bez ponavaljanja: " + brojevibezponavljanja);
		
		System.out.println("Aritmeticka sredina: " + aritmetickasredina(brojevibezponavljanja));
		
		System.out.println("Najveci broj: " + maxelement(brojevibezponavljanja));
		
		obrnired(brojevibezponavljanja);
		
		input.close();
	}
public static ArrayList<Integer> listabezponavljanja (ArrayList<Integer> lista) {
	ArrayList<Integer> listabezponavljanja = new ArrayList();
	
	for(Integer broj : lista) {
		
		if (!listabezponavljanja.contains(broj)) {
			
			listabezponavljanja.add(broj);
			
		}
		
		
	}
	
	   return listabezponavljanja;
}

public static double aritmetickasredina (ArrayList<Integer> lista) {
	double a = 0;
	
	for (int j = 0; j <lista.size(); j++) {
		
		a = a + lista.get(j);
		
		
		
	}
	a = a/lista.size();
	
	return a;
	
}

public static int maxelement (ArrayList<Integer> lista) {
	
	int max = lista.get(0);
	
	for(int k = 1; k < lista.size(); k++) {
		
		if (lista.get(k) > max) {
			
			max = lista.get(k);
			
		}
	}
	return max;
}

public static void obrnired (ArrayList<Integer> lista) {

        for (int l = 0; l < lista.size()/2; l++) {
        	
        	int opposite = lista.size() -1-l;
        	int temp = lista.get(l);
        	
        	lista.set(l,lista.get(opposite));
        	lista.set(opposite,temp);
        }

System.out.println("Obrnuti red: " + lista);
}
}

