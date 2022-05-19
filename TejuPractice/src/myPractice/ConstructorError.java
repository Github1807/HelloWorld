package myPractice;


class DiffClass{
	String name;
	int age;
	String grade;
	
	
	DiffClass(){
		System.out.println("ParameterLess Constructors");
	}
   DiffClass(String name){
		this.name=name;
	}
   DiffClass(String name, int age){
		this.name=name;
		this.age=age;
	}
//   DiffClass(String grade){
//		this.grade=grade;
//		
//	}
	 
	
}
public class ConstructorError {

	public static void main(String[] args) {
//		DiffClass d1=new DiffClass();
//		DiffClass d2=new DiffClass("Rakhi");
//		

	}

} 
