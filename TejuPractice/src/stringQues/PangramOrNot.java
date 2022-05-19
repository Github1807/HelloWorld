package stringQues;

public class PangramOrNot {

	
		 public static boolean checkPangram(String str)
		    {
			 
			 boolean[] mark = new boolean[26];					    // Create a hash table to mark the
			 int index = 0;											        // characters present in the string
															        // By default all the elements of
			 				                                        // mark would be false.
		 
		                                                             // For indexing in mark[]
		        
                                                           			// Traverse all characters // If uppercase character, subtract 'A'
	                                                                 // to find index.
		        
		        for (int i = 0; i < str.length(); i++) {
		            
		            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
		                index = str.charAt(i) - 'A';
		 
		            // If lowercase character, subtract 'a'
		            // to find index.
		            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
		 
		                index = str.charAt(i) - 'a';
		 
		            // If this character is other than english
		            // lowercase and uppercase characters.
		            else
		                continue; 
		            mark[index] = true;
		        }
		 
		        // Return false if any character is unmarked
		        for (int i = 0; i <= 25; i++)
		            if (mark[i] == false)
		                return (false);
		 
		        // If all characters were present
		        return (true);
		    }
		 
		    // Driver Code
		    public static void main(String[] args)
		    {
		        String str = "The quick brown fox jumps over the lazy dog";
		 
		        if (checkPangram(str) == true)
		            System.out.print(" is a pangram.");
		        else
		            System.out.print( " is not a pangram.");
		    }
		}

	


