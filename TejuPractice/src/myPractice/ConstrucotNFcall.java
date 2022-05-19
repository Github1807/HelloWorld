package myPractice;
class Employees {
//	
//	String Name;
//	int age;
//	float marks; 
//	
//	 Employees(){              default Constructor
//		System.out.println("Constructor Called");
//	}
//	 Employees(String Name,int age,float marks){   Parameter cOnstructor
//		this.Name=Name;
//		this.age=age;
//		this.marks=marks;
//		
//	}
//	public float getMarks() {
//		return this.marks;
//	}
//	
//	public void assignToValues(String Name,int age,float marks) {
//		this.Name=Name;
//		this.age=age;
//		this.marks=marks;
//		
//	}
//}
// 
	String Name;
	int age;
	float marks; 
	
	 Employees(){
		 this.Name="Teju";
			this.age=50;
			this.marks=56.8f;
	}
	 Employees(String Name,int age,float marks){
		this.Name=Name; 
		this.age=age;
		this.marks=marks;
		 
	}
	public float getMarks() {
		return this.marks;
	}
	
	public void assignToValues(String Name,int age,float marks) {
		this.Name=Name;
		this.age=age;
		this.marks=marks;
		
	}
}
	 public class ConstrucotNFcall {
	public static void main(String[] args) {
		 Employees s1=new  Employees();
	//	s1.assignToValues("teju",20, 45.5f); if not assigned values then it takes values from default constructors, 
		                                   // leaving this same if we comment on default constructor it will throw error
		System.out.println(s1.Name);       // since values needs to be assigned when new constructor is created
		System.out.println(s1.age);
		System.out.println(s1.marks);    
		
		 Employees s2=new  Employees();
		s2.assignToValues("RaviShankar",21, 43.5f);
		
		System.out.println(s2.Name);
		System.out.println(s2.age);
		System.out.println(s2.marks); 
 
	}
 
}
 
