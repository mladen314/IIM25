package cas_260226;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] niz;     // ili int niz[];
		niz = new int[10];
		niz[0] = 15;
		niz[1] = 10;
		niz[2] = niz[0]+niz[1];
		int k = 5;
		niz[k] = niz[2]*10;
		
		System.out.println(niz[9]);
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("vrijevnos elementa na "+i+"-toj poziciji je "+niz[i]);
		}
		
		double [] x = {15.2, 17.4, 21.3, 31.5};
		
		for (double element : x) {
			System.out.print(element+" ");
		}

	}

}
