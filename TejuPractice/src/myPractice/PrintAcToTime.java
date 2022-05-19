package myPractice;

public class PrintAcToTime {
          public static void main(String args[]) {
        	  int time=19;
        	  
        	  if(time<6) {
              System.out.println("Good Morning");    
        	  }
        	  else if(6<time && time<12) {
        		  System.out.println("for Noon");  
        		  }
        	  else if(12<time && time<18) {
        		  System.out.println("After Noon"); 
        	  }
        	  else if(18<time && time<24) {
        		  System.out.println("Good evening"); 
        	  }
        	  else {
        		  System.out.println("Invalid Input");   
        	  }
        	  
        	  
  }
}