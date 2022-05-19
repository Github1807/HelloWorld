package myPractice;

class Student{
	
	String Name;
	int age;
	float marks;
	public float getMarks(){
		return this.marks;
	}
	
}

public class ClassObjectDemo {
  public static void main(String args[]) {
	  Student S1=new Student();
	  S1.Name="Rakhi";
	 S1.marks=88.5f;
	 S1.age=27;
//	 System.out.println(S1.marks);        this line &
//	 System.out.println(S1.age);
//	 System.out.println(S1.Name);
	 System.out.println(S1.getMarks());   //This line will print same
	 
//	 Another Student can be created
	 Student S2=new Student();
	 S2.Name="Teju";
	 S2.age=22;
	 S2.marks=98.7f;
//	 System.out.println(S2.age);
//	 System.out.println(S2.marks);
//	 System.out.println(S2.Name);
	 System.out.println(S2.getMarks());
	 
	 
	 
	 
	  
	 
	 
	 
	 
	 
  }
}
