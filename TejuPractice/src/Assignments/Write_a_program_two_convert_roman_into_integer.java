package Assignments;

import java.util.HashMap;
import java.util.Scanner;

public class Write_a_program_two_convert_roman_into_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> rom=new HashMap<>();
        rom.put('I',1);
        rom.put('V',5);
        rom.put('X',10);
        rom.put('L',50);
        rom.put('C',100);
        rom.put('D',500);
        rom.put('M',1000);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i!=s.length()-1 && rom.get(ch)< rom.get(s.charAt(i+1))){
                sum+=rom.get(s.charAt(i+1))- rom.get(ch);
                i++;
            }
            else{
                sum+=rom.get(ch);
            }
        }
        System.out.println(sum);
    }
}