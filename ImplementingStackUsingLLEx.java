public class ImplementingStackUsingLLEx {

	   class Node {    
	      int data;
	      Node next; 
	   }

	   static Node top;
	   ImplementingStackUsingLLEx()
	   {
	      this.top = null;
	   }

	   public void push(int x)
	   {
	      Node newNode = new Node();
	      newNode.data = x;
	      newNode.next = top;
	      top = newNode;
	   }

	   public void pop()
	   {
	      if (top == null) 
	         return ;
	      top = top.next;
	     
	   }


	   public int peek()
	   {
	      if(top == null)
	         return -1;
	      return top.data;
	   }


	   public void search(int elementToSearch) {
	      
	      if(top == null)
	         System.out.println("Stack Is Empty");
	      Node temp = top;
	      while(temp != null) {
	      
	         if(temp.data == elementToSearch) {
	            System.out.println("Element Is Present In Stack");
	            return;
	         }
	            
	         temp = temp.next;
	      }
	      
	      if(temp == null)
	         System.out.println("Element Is Not Present In Stack");
	   }
	   
	   public void display()
	   {

	      Node temp = top;
	      while (temp != null) {
	         System.out.print(temp.data + " ");
	         temp = temp.next;
	      }
	      System.out.println();
	   }


	   public static void main(String[] args) {
	      
		   ImplementingStackUsingLLEx s = new ImplementingStackUsingLLEx();
	      s.push(11);
	      s.push(2);
	      s.push(31);
	      s.push(4);
	      s.display();
	      s.pop();
	      System.out.println("the numbr is popped");
	      s.display();
	      System.out.println(s.peek());
	      s.search(31);
	      s.search(1000);
	      s.pop();
	      
	      s.display();
	   }


}
