package myPractice;


class Chai {
	int x;
	int y;
	Chai(){
	   this(10);
	   System.out.println("parameterless Constructor");
	}
   Chai(int x){
		this(x,15);
		this.x=x;
		System.out.println("Constructor 2");
   }
	
   Chai(int x,int y){
	    
		this.x=x;
		this.y=y;
		System.out.println("Constructor 3");
  }
   Chai(Chai Obj2){
	   this.x=Obj2.x;
	   this.y=Obj2.y;
   }
   public  void displayObj() {
	   
	   System.out.println(x);
	   
	   System.out.println(y);
   }
}

public class CopyConstructor {

	public static void main(String[] args) {
	Chai c1=new Chai();
	c1.displayObj();
	
	Chai Obj2=new Chai(c1);
	Obj2.displayObj();
	}

}


