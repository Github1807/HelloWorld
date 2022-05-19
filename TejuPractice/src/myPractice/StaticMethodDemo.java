package myPractice;
class E{
	int a;
	public static void show() { //If removed Static From both child show will give op   
		System.out.println("Parent Show");
	}
}  
	
	class  F extends E{
		
		int b;
		 
		public static void show() {
			System.out.println("child Show");  
		}
}  

public class StaticMethodDemo
{


	
	public static void main(String[] args) {
		E obj=new F();
		
		obj.show(); 

	}
	 

}

