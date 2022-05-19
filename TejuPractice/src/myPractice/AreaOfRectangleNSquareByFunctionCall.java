package myPractice;

public class AreaOfRectangleNSquareByFunctionCall {
	public static double VolumeOfSquare(double a) {
		return a*a*a;
	}
	public static double VolumeOfRectangle(double a,double b,double c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		System.out.println(VolumeOfSquare(6.9));
		System.out.println(VolumeOfRectangle(2.5,3.8,4.7));

	}
 
}
