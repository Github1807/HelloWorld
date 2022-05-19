package myPractice;

public class CheckIfNOIsPrimeOrNOtUSIngfcallNBooleanflag {
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
		
		System.out.println(primeNo(31));

	}

}
 