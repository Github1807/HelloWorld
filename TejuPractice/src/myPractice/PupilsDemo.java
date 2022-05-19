package myPractice;
class Pupil {
	
	String Name;
	int age;
	float marks; 
	
	public float getMarks() {
		return this.marks;
	}
	
	public void assignToValues(String Name,int age,float marks) {
		this.Name=Name;
		this.age=age;
		this.marks=marks;
		
	}
}
public class PupilsDemo { 

	public static void main(String[] args) {
		Pupil s1=new Pupil();
		s1.assignToValues("teju",20, 45.5f);
		
		System.out.println(s1.Name);
		System.out.println(s1.age);
		System.out.println(s1.marks);    
		 
		Pupil s2=new Pupil();
		s2.assignToValues("RaviShankar",21, 43.5f);
		
		System.out.println(s2.Name);
		System.out.println(s2.age);
		System.out.println(s2.marks); 

	}
 
} 


