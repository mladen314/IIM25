package App;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, ArrayList<Integer>> ucenici = new HashMap<>();
		
		String a = sc.nextLine();
		
		int broj = Integer.parseInt(a);
		
		for(int i = 0; i < broj; i++) {
			String identifikacija = sc.nextLine();
			Unos(ucenici, identifikacija);
		}
		
		String st = sc.nextLine();
		System.out.println(Prosjekpojedinacni(ucenici, st));
	}

	public static void Unos(Map<String, ArrayList<Integer>> x, String y) {
		String[] lom = y.split(",");
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		for (int i = 1; i < lom.length; i++) {
			lista.add(Integer.parseInt(lom[i].trim()));
		}
		x.put(lom[0], lista);
	}
	
	public static float Prosjekpojedinacni(Map<String, ArrayList<Integer>> x, String y) {
		if(x.containsKey(y)) {
			float suma = 0f;
			float prosjek = 0f;
			
			ArrayList<Integer> ocjene = x.get(y);
			
			for(int i = 0; i < ocjene.size(); i++) {
				suma+=ocjene.get(i);
			}
			
			prosjek = suma/ocjene.size();
			return prosjek;
		}else {
			return 0f;
		}
	}
	
}

