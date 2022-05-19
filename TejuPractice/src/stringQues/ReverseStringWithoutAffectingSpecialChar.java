package stringQues;

public class ReverseStringWithoutAffectingSpecialChar {
	
	public static void reverse(char str[]) {
		int i=0,j=str.length-1;
		while(i<j) {
			if(!Character.isAlphabetic(str[i])) 
				i++;
			else if(!Character.isAlphabetic(str[j]))
				j--;
			else {
				char temp=str[i];
				str[i]=str[j];
				str[j]=temp;
				i++;
				j--;
				
			}
				 
		}
	}
	public static void main(String args[]) {
		String str="Teju@xyz$#Ravi";
		char ch[]=str.toCharArray();
		System.out.println(str);
		reverse(ch);
		String revStr=new String(ch);
		System.out.println("Output string: " + revStr);
		
				
	
	} 
	}
	
	
	
	 
	
	
	
	

	
	
	
	
	
	
	
	

//	public static void reverse(char str[])
//    {
//        int r = str.length - 1, l = 0;
//        while (l < r)
//        {
//        	if (!Character.isAlphabetic(str[l]))
//                l++;
//            else if(!Character.isAlphabetic(str[r]))
//                r--;
//            else
//            {
//                char tmp = str[l];
//                str[l] = str[r];
//                str[r] = tmp;
//                l++;
//                r--;
//            }
//        }
//    }
// 
//   
//    public static void main(String[] args)
//    { 
//        String str = "Teju#456#%^"; 
//        char[] charArray = str.toCharArray();
// 
//        System.out.println("Input string: " + str);
//        reverse(charArray);
//        String revStr = new String(charArray);
//        System.out.println("Output string: " + revStr);
//    } 
//}
//

