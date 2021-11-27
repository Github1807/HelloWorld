import java.util.Scanner;
public class PerfectSquareNumber
{
    public static void main(String args[])
    {
        //Taking the number as input from the user using scanner class
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        
        //checking the number is perfect square or not.
        double root = Math.sqrt(num);
        //if the condition satisfies then given number is perfect square 
        if((Math.floor(root) - root)==0)
             System.out.println(num+" is a Perfect Square Number");
        // else given number is not the perfect square 
        else
            System.out.println(num+" is Not a Perfect Square Number");
    }     
}
