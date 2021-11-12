package test9;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+Circlee.numberOfObjects);
		
		Circlee c1 = new Circlee();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		
		Circlee c2 = new Circlee(5);
		c1.radius = 9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		System.out.println("c2: radius("+c2.radius+") and number of Circle objects ("+c2.numberOfObjects+")");
		
	}

}
