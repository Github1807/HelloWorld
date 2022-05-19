package myPractice;

class CallCons{
	String name;
	int age;
	String grade;
	


 CallCons(){
	 
 }
CallCons(String name,int age){
	this.name=name; 
	this.age=age;
 }
CallCons(String name,int age,String grade){
	this(name,age);
	
	this.grade=grade;
	
	
 }
 

public class ConstructorCall {

	public static void main(String[] args) {
		CallCons c1=new CallCons("Teju",21,"1st");
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.grade);
	}

} 
}
 