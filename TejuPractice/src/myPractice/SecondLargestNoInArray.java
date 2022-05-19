package myPractice;
import java.util.Scanner;
public class SecondLargestNoInArray {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sec_lar=Integer.MIN_VALUE;
		int max=sec_lar+1;	
		   int temp=0;
		for(int j=0;j<n;j++)
		{
         
            if(max<arr[j]){
                temp=max;
                max=arr[j]; 
                sec_lar=temp;
            }
        }
        System.out.println(sec_lar);
	}
 
}

/*package geeksterAssignments;

public class SecondSmallestArray {
    public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2,1};
        int Sec_min=Integer.MAX_VALUE;
        int min=Sec_min-1;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            if(min>arr[i]){
                temp=min;
                min=arr[i];
                Sec_min=temp;
            }
        }
        System.out.println(Sec_min);
    }
}
*/