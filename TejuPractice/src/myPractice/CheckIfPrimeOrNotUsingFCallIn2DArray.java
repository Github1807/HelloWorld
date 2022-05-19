package myPractice;

public class CheckIfPrimeOrNotUsingFCallIn2DArray {
	
	public static boolean primeNo(int arr[][],int n) {
				boolean flag=true;
		
			 	for(int i=2;i<n/2;i++) {
					if(n%i==0) {
						flag=false;
						break;
					} 
				} 
			return flag; 
			}
		
			public static void main(String[] args) {
			  
				int arr[][]= {{35,31,41},{23,34,45},{32,51,32}};
				
					System.out.println(primeNo(arr,31));
					
		

	 
		}

}
