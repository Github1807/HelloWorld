package MockPractice;

public class SizeOfAnArray {
	
	public static int getSize(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,5,3,7,3,4,5}; 
		System.out.println(getSize(arr));

	}

}
