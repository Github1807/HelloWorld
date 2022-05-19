package myPractice;

class A{
	int a;
	public void show() {
		System.out.println("Parent Show");
	}
}
	class B extends A{
		int b;
		public void show() {
			System.out.println("child Show");  
		}
}

public class MethodOverridingDemo {

//	public static void main(String[] args) {
//		A obj=new A();
//		
//		obj.show(); 
//
//	}
	
	public static void main(String[] args) {
		B obj=new B();
		 
		obj.show(); 

	}
	
	
	
	

}
