package stringQues;

public class CountOcuurancesOfAlphabetsInStringIgnoringCase {

	public static void main(String[] args) {
//		sc=new Scanner(System.in);
//		System.out.println("Enter String");
//		String str=sc.nextLine();
		String s="MMababctamantlslmag";
	    int count= 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                count++;

	            } 
	        }   
	        System.out.println(s.charAt(i)+"--"+count);
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        count = 0; 
	}
  
}
}