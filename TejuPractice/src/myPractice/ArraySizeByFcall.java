package myPractice;

public class ArraySizeByFcall {
	
	public static int getSize(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,57,56};
		System.out.println(getSize(arr));
				
	
	}

} 
