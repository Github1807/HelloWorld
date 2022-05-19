package myPractice1;

public class SumEqualsToTarget {

	public static void main(String[] args) {
		int arr[]= {2,3,4,7,5,6,7,8};
		int target=13;
		int count =0;
		int i=0;
		int j=i+1;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++)
			if((arr[i]+arr[j])==target) {
				count++; 
				System.out.println(" "+arr[i]+" "+arr[j]);
			}
		}
		System.out.println(count);
		
	}

} 
  