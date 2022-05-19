package myPractice;
import java.util.Arrays;
public class CheckIfGivenStringIsAnagramOrNotByUsingSort {
	public static void main(String[] args) {
		String str1="Ravi";  
		String str2="viRa";
		boolean status=false;
		if(str1.length()==str2.length())
		{ 
			status=true;
			char ch1[]=str1.toCharArray();
	 		char ch2[]=str2.toCharArray();
			Arrays.sort(ch1); 
			Arrays.sort(ch2);  
			status=Arrays.equals(ch1,ch2);
		} 
		if(status)
		{
			System.out.println("Is Anagram");
		}
		else
		{
			System.out.println("Is Not Anagram");
		}

	}

}
