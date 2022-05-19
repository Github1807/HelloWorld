package myPractice;

public class LongestCommonPrefix {

	public static void main(String[] args) {
	
		String arr[]= {"geeks","geek","geekso"};
		
		for(int i=0;i<=arr.length;i++) {
		
			if((arr[0].charAt(i)==arr[1].charAt(i))&&(arr[0].charAt(i)==arr[2].charAt(i))){
				
				System.out.print(arr[0].charAt(i));
			
			} 
			 
			else  
			
				break;
			
		}

	}
 
}
