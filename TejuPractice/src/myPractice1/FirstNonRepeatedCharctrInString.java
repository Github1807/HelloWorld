package myPractice1;

public class FirstNonRepeatedCharctrInString {

	public static void main(String[] args) {

		String S="ejasewini";
		  for(int i=0;i<S.length();i++) { 
			   char ch=S.charAt(i);
			   if(ch!=S.charAt(i+1)) {
				   System.out.print(ch);
				   
				   break;
			   }
		   }
	}

} 
