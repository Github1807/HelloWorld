package MockPractice;

public class CheckIfNosPrimeOrNotIn2DArrayByFcall {
	
	public static boolean checkPrime(int arr[][],int n) {
		
				
				boolean flag=false;
				for(int k=2;k<n/2;k++) {
					if(n%k==0) {
					flag=true;
				}
			}
				return flag;
				}
				
			
	 
		
	 

	public static void main(String[] args) {
	  int arr[][]= {{1,2,3},{63,71,94},{11,31,35}};
	  System.out.println(checkPrime(arr,11));
	}

}
