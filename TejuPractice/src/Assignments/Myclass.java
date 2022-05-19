package Assignments;

public class Myclass {
	public static int x=9;
	public static int y=8;
	public static void swap (int x,int y) {
		int temp=x;
		x=y;
		y=temp;
		}
	public static void main(String args[]) {
		Swap(x,y);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
		
	}
 
}
