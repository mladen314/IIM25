package cas_260423_set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> imena = new HashSet<>();
		
		imena.add("Marko");
		
//		System.out.println(imena);
		
		imena.addAll(Arrays.asList("Janko", "Bozidar", "Milan"));
		
		imena.add("Marko");
		
		System.out.println(imena);
		
		
		TreeSet<String> imenaTree = new TreeSet<>();
		
		for(String i : imena) {
			imenaTree.add(i);
		}
		
		System.out.println(imenaTree);
		
		LinkedHashSet<Integer> brojevi = new LinkedHashSet<Integer>();
		
		brojevi.add(5);
		brojevi.add(2);
		brojevi.add(3);
		brojevi.add(1);
		
		System.out.println(brojevi);
		
		Set<String> names = Set.of("Milan", "Jovan", "Branko");
		
		System.out.println(names);
		
//		names.add("Jovan"); <- dovodi do gresci
		
		
	}

}
