
package myPractice;
public class CheckIfSumOfTwoElementsInArrayIsTarget {
	public static void main(String[] args) {
		int arr[]= {1,5,4,6,7};
		int n=10;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==n) {
					System.out.println("Miracle");
				}
				
				}
			}
		
			
		} 

	}


