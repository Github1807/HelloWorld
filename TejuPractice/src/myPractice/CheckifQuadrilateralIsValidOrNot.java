package myPractice;

public class CheckifQuadrilateralIsValidOrNot {

	public static void main(String[] args) {
		int a=90,b=91,c=90,d=90;
		if(a+b+c+d!=360 ||(a<0||b<0||c<0||d<0))
		{
			System.out.println("The Quadrilateral is invalid ");
		}
		else
		{
			System.out.println("The Quadrilateral is valid ");
		}
	}

}
