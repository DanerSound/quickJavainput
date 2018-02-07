package base;

/**
 *
 * @author Andre Cristhian Barreto Donayre
 * 
 **/
public class TestQuickInput {

	public static void main(String[] args) {

		System.out.println(" Remember that java can read from outside only STRING");

		Primitivetypes test = new Primitivetypes();

		System.out.println("inserisci due numeri INTERI");
		test.n1 = Integer.parseInt(IO.lineIn());
		test.n2 = Integer.parseInt(IO.lineIn());

		System.out.println("la somma dei numeri è " + test.sum());

		System.out.println("inserisci un float");
		test.n3 = Float.parseFloat(IO.lineIn());
		System.out.println("il numero amplificato di due " + test.multFloat());

		test.readedString();
	}

}
