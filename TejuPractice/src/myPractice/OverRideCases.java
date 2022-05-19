package myPractice;
class C{
	int a;
	public void show() {   //Make this private But private method cannot be overriden So it is for this
		System.out.println("Parent Show");
	}
} 
	
	class  D extends C{
		 
		int b;  
		@Override
		public void show() { 
			System.out.println("child Show");  
		}
} 

public class OverRideCases {


	
	public static void main(String[] args) {
		D obj=new D();
		
		obj.show(); 

	}
	
	
	 
	

}


