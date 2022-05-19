package myPractice;
import java.util.*;
public class RomanToIntegerUsingHashMap {

	public static void main(String[] args) {
		Map<Character,Integer> MapOfNumbers=new HashMap<>();
	//	MapOfNumbers.put(key, value);
		MapOfNumbers.put('I',1);
		MapOfNumbers.put('X',10);
		MapOfNumbers.put('L',50);
		MapOfNumbers.put('C',100);
		MapOfNumbers.put('D',500);
		MapOfNumbers.put('M',1000);
		MapOfNumbers.put('V',5);
//System.out.println(MapOfNumbers.get('M')+MapOfNumbers.get('I'));
	String input="IV";
	int temp=0;
	for(int i=0;i<input.length();i++) {
		char tempChar=input.charAt(i);
		if(i>0 && MapOfNumbers.get(tempChar)>MapOfNumbers.get(input.charAt(i-1)) ) {
			temp=temp+MapOfNumbers.get(tempChar)-2*MapOfNumbers.get(input.charAt(i-1));}
		else
		{
			temp=temp+MapOfNumbers.get(tempChar);
		}
		}
	System.out.println(temp);
	}
	} 


 