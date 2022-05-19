package MockPractice;

public class PatternPractice {

	public static void main(String[] args) {
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println(" ");
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println(" ");
//		}
		
//		for(int i=1;i<=5;i++) {  
//			for(int j=1;j<=i;j++) { 
//				System.out.print(i+" ");
//			}
//			System.out.println(" ");
//		}
		int value=1;
		for(int i=1;i<=5;i++) {  
			for(int j=1;j<=i;j++) { 
				System.out.print(value+" ");
				value++;
			}
			System.out.println(" ");
		} 
	} 
 
} 
