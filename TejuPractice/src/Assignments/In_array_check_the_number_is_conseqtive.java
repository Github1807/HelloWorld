package Assignments;
import java.util.Scanner;

public class In_array_check_the_number_is_conseqtive {
	public static boolean consectiv_number(int arr[],int n){
        boolean conseqtiv=false;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                conseqtiv=true;
            }
        }
        return conseqtiv;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a= sc.nextInt(); 
        int arr[]=new int[a];
        System.out.println("fill the array");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the number you want to search in array");
        int n= sc.nextInt();
        System.out.println(consectiv_number(arr,n));

    }
}


