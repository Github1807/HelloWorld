package myPractice;

public class CountPrimesInarrayUsingFunction {

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
			int arr[]= {35,31,41};
			for(int i=0;i<arr.length;i++) {
				if( primeNo(arr[i])) {
					count++;
				}
			}
			System.out.println(count);

		}

	}


 