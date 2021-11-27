import java.util.*;

public class Counting_numbers {

    
    public static void main(String[] args) {
        
        int num, count = 0;
        
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        
        num = in.nextInt();
        
        while( num > 0) {
            
            //Reduce number in each iteration
            num = num / 10;
            
            //count
            count++;
        }
        
        System.out.println("Number of digits in a number 
                            is "+ count);
    }
    
}



