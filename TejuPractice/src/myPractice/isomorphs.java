package myPractice;
public class isomorphs {

	 static final int CHAR = 26;
	    static boolean isoMorphic(String str1, String str2)
	    {
	        int n = str1.length();           	// This function returns true if
		    									// str1 and str2 are isomorphic
	        int m = str2.length();
	        if (n != m)											// Length of both strings must be
        	return false;								        // same for one to one
	        int[] countChars1 = new int[CHAR];
	        int[] countChars2 = new int[CHAR];					// correspondence

	        for (int i = 0; i < n; i++) {
	            countChars1[str1.charAt(i) - 'a']++;
	            countChars2[str2.charAt(i) - 'a']++;
	        }											     // For counting the previous appearances
	        for(int i= 0; i < n; i++) {                       
	            if (countChars1[str1.charAt(i) - 'a']
	                != countChars2[str2.charAt(i) - 'a']) {
	                return false;
	            }
	        }
	        return true;
	    }
	  
    // Driver Code
    public static void main(String[] args)   
    {
        System.out.println(isoMorphic("abb", "xyy") ? 1: 0);
        System.out.println(isoMorphic("aba", "xyy") ? 1: 0);
    }
	}											       
	 
// of character in both the strings

// Process all characters one by one
 // For string to be isomorphic the 
    // previous counts of appearances of
    // current character in both string
    // must be same if it is not same we
    // return false.

  //before it was not working for the test case mentioned below(wrong output)
  // str1 = "aba" , str2 = "xyy"
            
	          
 

