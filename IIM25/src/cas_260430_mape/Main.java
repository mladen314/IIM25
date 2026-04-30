package cas_260430_mape;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> matematika = new HashMap<>();
		while(true) {
			System.out.println("Sta zelite?");
			System.out.println("1)Unos ucenika");
			System.out.println("2)Unos ocjene");
			System.out.println("3)Provjera ocjene");
			System.out.println("4)Brisanje ucenika");
			System.out.println("5)Kraj");
			String x = sc.nextLine();
			if(x.charAt(0) == '1'){
				System.out.println("Unesite ucenika");
				String identifikacija = sc.nextLine();
				unos(matematika, identifikacija);
			}else if(x.charAt(0) == '3') { 
				System.out.println("Kom uceniku?");
				String ime = sc.nextLine();
				if(matematika.containsKey(ime)) {
					System.out.println(matematika.get(ime));
				}else {
					System.out.println("Nepostojeci ucenik");
				}
			}
		}}
		public static void unos(Map<String,Integer>x,String y) {
			String[]komad = y.split(",");
			x.put(komad[0], Integer.parseInt(komad[1].trim()));
		}
	}


