package myPractice;

public class AccptArgs {
	
	public static void args1(int ...d) {
		System.out.println("The length of array is "+d.length);
	}
	
	public static void main(String args[]) {
		args1(1,2,34,56,67,43);
	}
	
	
	
	
	
	
	
	
	
}





//	public static void args1(int ...e) {
//	System.out.println("total arguments entered "+e.length);
////	for(int i=0;i<d.length;i++) {
////		System.out.println(d[i]+" ");
////	}
//	} 
// 
//	public static void main(String[] args) {
//		args1(37,48,74,49,98,73,4,5);
//
//	} 
//
//} 

 



//public class accept_Args {
//	public static void arg(int...c){
//		System.out.println("total args entered"+ c.length);
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i]+ " ");
//			
//		}
//	}
//	public static void main(String args[]) {
//		arg(45,67,87,98);
//	}
//
//}