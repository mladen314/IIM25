package cas_251014;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 15;
		
		double p, o;
		
		p = Math.pow(r, 2)*Math.PI;
		o = 2*r*Math.PI;
		
		p = Math.round(p*100)/100.0;
		o = (double)Math.round(o*100)/100;
		
		System.out.println("Povrsina i obim kruga poluprecnika "+r+" je "+p+" i "+o);
		System.out.printf("Povrsina i obim kruga poluprecnika %d je %.2f i %.2f", r, p, o);
	}

}
