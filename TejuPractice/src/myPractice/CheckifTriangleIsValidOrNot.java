package myPractice;

public class CheckifTriangleIsValidOrNot {

	public static void main(String[] args) {
		int a=60,b=60,c=34;
		if(a+b+c!=180 || (a<0 || b<0 || c<0)) 
		{
		System.out.println("The Triangle is invalid");
		}
		else
		{
		System.out.println("The Triangle is valid");
		}
	}

}
