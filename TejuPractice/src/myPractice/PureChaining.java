package myPractice;

class Chain {
	int x;
	int y;
	Chain(){
	   this(10);
	   System.out.println("parameterless Constructor");
	}
   Chain(int x){
		this(x,15);
		this.x=x;
		System.out.println("Constructor 2");
   }
	
   Chain(int x,int y){
	    
		this.x=x;
		this.y=y;
		System.out.println("Constructor 3");
  }
   public  void displayObj() {
	   
	   System.out.println(x);
	   
	   System.out.println(y);
   }
}

public class PureChaining {

	public static void main(String[] args) {
	Chain c1=new Chain();
	c1.displayObj();

	}

}
