package myPractice1;

public class PermutationsOfString {
	
 static void permutedStrings(String S,String ans) {
	   if (S.length()==0) {
		   System.out.println(ans+" ");
		   return ;
	   }
	   for(int i=0;i<S.length();i++) {
		   char ch=S.charAt(i);
		   String a=S.substring(0,i)+S.substring(i+1);
		   permutedStrings(a,ans+ch);
	   }
	   }
	 
  

	public static void main(String[] args) {
	
		String S="Tejaswini";
				permutedStrings(S,"");
	}

} 
