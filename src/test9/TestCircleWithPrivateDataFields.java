package test9;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circleee myCircle = new Circleee(5.0);
        System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
        System.out.println("The number of objects created is "+Circleee.getNumberOfObjects());
	}

}
