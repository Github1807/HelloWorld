package PlacementPrac;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;



class WordFrequencyCounter { 
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
      String paragraph = sc.nextLine();
      String[] words = paragraph.split(" ");
      HashMap<String,Integer> map = new LinkedHashMap<String,Integer>();

      for (String word : words)
      {
              String temp = word.toUpperCase();
              if(map.containsKey(temp))
              {
                  map.put(temp,map.get(temp)+1);
              }
              else
              {
                  map.put(temp,1);
              }
      }
      for (Map.Entry<String,Integer> entry : map.entrySet())
      {
          System.out.println(entry.getKey()+" "+ entry.getValue());
      }
  }
}


