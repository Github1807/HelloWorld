package myPractice;
 
class Candidates {
	
	String Name;
	int age;
	float marks; 
	
	Candidates(){
		System.out.println("Constructor Called");
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
 
	 public class ConstructorDemo{
	public static void main(String[] args) {
		Candidates s1=new Candidates();
		s1.assignToValues("teju",20, 45.5f);
		
		System.out.println(s1.Name);
		System.out.println(s1.age);
		System.out.println(s1.marks);    
		
		Candidates s2=new Candidates();
		s2.assignToValues("RaviShankar",21, 43.5f);
		
		System.out.println(s2.Name);
		System.out.println(s2.age);
		System.out.println(s2.marks); 

	}
 
}
 

