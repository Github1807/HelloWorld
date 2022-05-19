package myPractice;
public class BracketPattern {
	public static void main(String[] args) {
	
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("[");
			}
			System.out.print("*");
			for(int k=0;k<i;k++) {
				System.out.print("]");
			}
			System.out.println(" ");
		}
		
		

	}

}
//for(int i=1;i<5;i++) {
//	for(int j=1;j<=i;j++) {
//		System.out.print("[");
//	}
//	for(int l=0;l<i;l++) {
//	System.out.print("*");}
//	for(int k=0;k<i;k++) {
//		System.out.print("]");
//	}
//	System.out.println(" ");
//}
//
//
//
//}











//for(int i=1;i<5;i++) {
//	for(int j=1;j<=i;j++) {
//		System.out.print("[*");
//	}
//	
//	System.out.print("*");
//	for(int k=0;k<i;k++) {
//		System.out.print("*]");
//	}
//	System.out.println(" ");
//}
//
//	}
//
//}