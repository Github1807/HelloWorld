package myPractice; 

public class CountPrimesIn2DArrayUsingFCall {

		public static boolean primeNo(int n) {
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
			int count=0;
			int arr[][]= {{35,31,41},{23,34,45},{32,51,32}};
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
				if( primeNo(arr[i][j])) {
					count++;
				}
			}
		

		}
			System.out.println(count);  
	}


 
	}


