package cas_251002;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Napisati program koji za zadate vrijednosti kateta racuna 
		 * povrsinu i obim pravouglog trougla
		 */
		
		int a=11;
		int b=5;
		//int c = (int)Math.sqrt(a*a+b*b);
		double c = Math.sqrt(a*a+b*b);
		
		double p, o;
		
		//p = (double)(a*b)/2;
		p = (a*b)/2.0;
		
		o = a+b+c;
		
		System.out.println("Povrsina trougla je "+p+", a obim je "+o);
		
		
		
	}

}
