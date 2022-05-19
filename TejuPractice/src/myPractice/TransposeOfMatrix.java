package myPractice;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		int arr[][]= {{1,3},{5,8}}; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				
				System.out.print(arr[j][i]+" ");
			 
			}
			System.out.println(" "); 
		} 
		for(int i=0;i<arr.length;i++) {
			int li=0; int ri=arr[0].length-1;
			
			
				while(li<ri) {
					int temp=arr[li][ri];
					arr[li][ri]=arr[ri][li];
					arr[ri][li]=temp;
					li++;
					ri--; 
					
				}
			}
		
		
		}
	}


