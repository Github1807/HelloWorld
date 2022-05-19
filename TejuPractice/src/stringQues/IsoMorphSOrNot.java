package stringQues;

public class IsoMorphSOrNot {
	static int CHAR=26;
	static boolean areIsomorphic(String str1,String str2) {
		int n=str1.length();
		int m=str2.length();
		if(n!=m) {return false;}
		int ch1[]=new int[CHAR]; 
		int ch2[]=new int[CHAR];
		for(int i=0;i<n;i++) {
			ch1[str1.charAt(i)-'a']++;
			ch2[str2.charAt(i)-'a']++;
		}
		for(int i=0;i<n;i++) {
			if(ch1[str1.charAt(i)-'a']!=ch2[str2.charAt(i)-'a']) {
				return false;
			}
		}
		return true;
		 
	}
	public static void main(String[] args) {
		System.out.println(areIsomorphic("abb","xyy")?1:0);

	}

}
