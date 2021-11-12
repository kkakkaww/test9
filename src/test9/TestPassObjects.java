package test9;

public class TestPassObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circleee myCircle = new Circleee();
		int n = 5;
		printArea(myCircle,n);
		
		System.out.println("\n"+"Radius"+myCircle.getRadius());
		System.out.println("n is "+n);
	}

    public static void printArea(Circleee c,int times) {
	    System.out.println("Radius \t\tArea");
	    while (times >= 1) {
		    System.out.println(c.getRadius()+"\t\t"+c.getArea());
		    c.setRadius(c.getRadius()+1);
		    times--;
	    }
    }
}
