package myPractice;

public class RightRotationSimmi {

	public static void main(String[] args) {
		int arr[]= {2,4,5,3};
		int N=arr.length;
		int k=2;
		for(int i=0;i<arr.length;i++) {
			if(i<k)
			System.out.print(arr[N+i-k]+" ");
			else
				System.out.print(arr[i-k]+" ");
		}
	}

}
