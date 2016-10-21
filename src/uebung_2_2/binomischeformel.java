package uebung_2_2;

public class binomischeformel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 8;
		double b = 3;
		
		double links = a*a;
		double mitte = 2*a*b;
		double rechts = b*b;
		
		double loesung = links + mitte + rechts;
				System.out.println("binomische Formel = "+ loesung);
	}

}
