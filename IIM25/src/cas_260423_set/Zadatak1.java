package cas_260423_set;

import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {
		// Zadatak1: Dat je spisak kupovina za danas i spisak kupovina za juce.
		// Pronadite proizvode koje ste kupili danas, ali ih niste kupovali juce.
		Scanner input = new Scanner(System.in);
		System.out.println("Namernice za danas:");
		HashSet<String> listToday = new HashSet<String>(Arrays.asList(input.nextLine().split(" ")));
		System.out.println("Namernice za јuce:");
		HashSet<String> listYesterday = new HashSet<String>(Arrays.asList(input.nextLine().split(" ")));
		for (String el : listToday) {
			if (!listYesterday.contains(el)) {
				System.out.print(el + " ");
			}
		input.close();
		}
	}

}
