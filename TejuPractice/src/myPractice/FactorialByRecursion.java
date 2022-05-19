package myPractice;

public class FactorialByRecursion {
	public static int factorial(int x) {
		if(x==0||x==1) 
		{
			return 1;
		}
		else {
			return (x*factorial(x-1));
		}
	}

	public static void main(String[] args) {
		 
		
		System.out.println(factorial(5));	
		
	}

}
//	static int factorial(int n)
//    {
// 
//        // Handling base case
//        // iIf value of n=1 or n=0, it returns 1
//        if (n == 0 || n == 1)
//            return 1;
// 
//        // Generic case
//        // Otherwise we do n*(n-1)!
//        return n * factorial(n - 1);
//    }
// 
//    // Method 2
//    // main driver method
//    public static void main(String[] args)
//    {
// 
//        // Calling method 1 to compute factorial and
//        // storing the result into a variable
//     
// 
//        // Print and display the factorial of number
//        // customly passed as an argument
//        System.out.println( factorial(5));
//    }
//}
//package myPractice;
//
//public class SumOfIntegersByRecursion {
//	public static int sumOfDigits(int x) {
//		
//		if(x>0) {
//			return(x+sumOfDigits(x-1));
//		}
//		else {
//			return 0;
//		}
//	}
//
//	public static void main(String[] args) {
//		System.out.println(sumOfDigits(10));
//	}
//
//}
