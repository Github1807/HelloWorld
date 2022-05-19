package myPractice;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		String x="2347536728";
		int Count=0;
		for(int i=0;i<x.length();i++) {
			if(x.codePointAt(i)!=0) {
				Count++;
			}
		}
		System.out.println(Count);
	}

}
