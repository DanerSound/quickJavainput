package base;

/**
 *
 * @author Andre Cristhian Barreto Donayre
 * 
 **/
public class TestQuickInput {

  public static void main(String[] args) {

	System.out.println(" Remember that java can read from keyboard only STRINGs ");
	System.out.println(" This is a test for Primitive types ");

	Primitivetypes test = new Primitivetypes();

	System.out.println(" Insert two Integers: ");
	test.number1 = Integer.parseInt(IO.lineIn());
	test.number2 = Integer.parseInt(IO.lineIn());

	System.out.println(" the sum of the numbers is " + test.sum());

	System.out.println(" Insert a Float number :");
	test.floatNumber = Float.parseFloat(IO.lineIn());
	System.out.println(" the multiplication by 2  of the floatNumber is :" + test.multFloat());
		
	test.readedString();
	}

}
