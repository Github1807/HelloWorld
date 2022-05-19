package PlacementPrac;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
  public static void main(String args[] ) throws Exception {
      /* Sample code to perform I/O:
       * Use either of these methods for input

      //BufferedReader
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String name = br.readLine();                // Reading input from STDIN
      System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

      //Scanner
      Scanner s = new Scanner(System.in);
      String name = s.nextLine();                 // Reading input from STDIN
      System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

      */

      // Write your code here
      Scanner sc = new Scanner(System.in);
      int[] heapArr = new int[101];
      heapArr[0] = 0;

      while(sc.hasNextInt()){
          int n = sc.nextInt();
          addToHeap(heapArr,n);
      }
      
      // for(int i= 1 ;i <= heapArr[0]; i++){
      //     System.out.print(heapArr[i]+ " ");
      // }

      System.out.println(heapArr[1]);

  }

  public static void heapify(int[] arr,int index){
      if(index == 0) return;
      
      int left = (index*2 <= arr[0] ? index*2 : -1);
      int right = (index * 2 + 1 <= arr[0] ? index*2+1 : -1);
      
      if(left!= -1 && arr[left] < arr[index]){
          int temp = arr[index];
          arr[index] = arr[left];
          arr[left] = temp;
          heapify(arr,index/2);
      }else if(right != -1 && arr[right] < arr[index]){
          int temp = arr[index];
          arr[index] = arr[right];
          arr[right] = temp;
          heapify(arr,index/2);
      }else{
          return;
      }
  }

  public static void addToHeap(int[] heapArr,int value){
          int size = heapArr[0]++;
          heapArr[size+1] = value;
          heapify(heapArr,(size+1)/2);
          return;
  }
}