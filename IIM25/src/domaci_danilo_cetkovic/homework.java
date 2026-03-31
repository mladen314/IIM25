package domaci_danilo_cetkovic;

import java.util.Scanner;

public class homework {
	public static boolean yes(int x) {
		for (int i = 2; i <= (x / 2); i++) {
			if ((x / i) * i == x) {
				return false;
			}
		}
		return true;
	}

	public static int no(int x) {
		int y = 0;
		for (int i = 2; i <= (x / 2); i++) {
			if ((x / i) * i == x) {
				y = y + 1;
			}
		}
		return y;
	}

	public static int niz(int x, int i) {
		int[] saber = new int[x];
		saber[i] = i + 1;
		return saber[i];
	}

	public static int prost(int x) {

		for (int t = x - 1; t >= 0; t--) {

			if (yes(niz(x, t))) {
				return niz(x, t);
			}
		}
		return 69;
	}

	public static int slozeni(int x) {
		int y = 0;
		int z = 0;
		for (int t = x - 1; t >= 0; t--) {
			int a = no(t);
			if (a > y) {
				y = a;
				z = t;
			}
		}
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner milo = new Scanner(System.in);
		System.out.println("Unijeti limit skupa prirodnih brojeva.");
		int x = milo.nextInt();
		milo.nextLine();
		System.out.println("Da li zelite:");
		System.out.println("a)broj sa najvise djelilaca");
		System.out.println("b)najveci prost broj u datom skupu?");
		String rijec = milo.nextLine();
		if (rijec.charAt(0) == 'b') {
			System.out.println(prost(x));
		}
		if (rijec.charAt(0) == 'a') {
			System.out.println(slozeni(x));
		}
		milo.close();
	}

}
