package cas_251007;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 17;
		int b = 13;
		double p, o;
		
		p = (double)(a*b)/2;
		
		double c;
		
		c = Math.sqrt(a*a+b*b);   // a*a -> Math.pow(a, 2)
		
		c = (double)Math.round(c*100)/100;
		System.out.println(c);
		o = a+b+c;
		
		System.out.println("P="+p);
		System.out.println("O="+o);
		
		// Povrsina trougla cije su katete a i b je p
		
		System.out.printf("Povrsina trougla cije su katete %d i %d je %.1f", a, b, p);

	}

}
