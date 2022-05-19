package myPractice;

public class SearchAnElementInSortedMatrix {

	public static void main(String[] args) {
		int d=34; 
		int arr[][]= {{12,34},{345,56}};
		int i=0;
		int j=arr[0].length-1;
		boolean flag=false;
		while(i<arr.length && j>=0) {
			if(d>arr[i][j]) {
				i++;
				
				
			}
			else if(d<arr[i][j]) { 
				j--;
				
		
			}
			else if(d==arr[i][j]) {
				flag=true;
				System.out.println("found");
				System.out.println("Found at "+ i+" "+ j);
				break; 
			}
		}
		if(!flag) {
			System.out.println("Not found"); 
		}
		
	}

}
