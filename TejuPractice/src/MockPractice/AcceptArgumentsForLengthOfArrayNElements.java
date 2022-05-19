package MockPractice;

public class AcceptArgumentsForLengthOfArrayNElements {
	
	public static void args1(int ...d) {
		System.out.println("The length Of array is "+d.length);
		for(int i=0;i<d.length;i++) {
		System.out.print(d[i]+" ");
	}
	}
 
	public static void main(String[] args) {
		args1(1,3,2,4,56,6,56,7);

	}

}
