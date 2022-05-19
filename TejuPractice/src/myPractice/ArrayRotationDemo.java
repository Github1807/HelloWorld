package myPractice;

public class ArrayRotationDemo {

	public static void main(String[] args) {
		int arr[][]= {{1,2},{4,5}};
        int n=arr.length;
        for(int i=0;i<n;i++) {
        	for(int j=i;j<n-i;j++) {
        		int temp=arr[i][j];
        		arr[i][j]=arr[n-1-j][n-1-i];
        		arr[n-1-j][n-1-i]=temp;
        	}
        }
        for(int i=0;i<n/2;i++) {
        	for(int j=0;j<n;j++) {
        		int temp=arr[i][j];  
        		arr[i][j]=arr[n-1-i][j];
        		arr[n-1-i][j]=temp;
        	}  
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println(" ");
        }
	}

}
