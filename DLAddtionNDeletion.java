public class DLAddtionNDeletion {
	 static Node head=null;
	 static Node tail=null;
     
     static class Node{
   	  int data;
   	  Node next;
   	  Node Previuos;
     
     public Node(int data) {
   	  this.data=data;
     }
     
     public static void addLastInDL() {
    	 Node new_Node=new Node(4);
     
    if(head==null) {
   	 
    	head=tail=new_Node;
   	    head.Previuos=null;
   	    tail.next=null;
   	   
 
    }
   Node temp=head;
   while(temp.next!=null) {
	   temp=temp.next;
   }
   tail=temp;
   tail.next=new_Node;
   new_Node.Previuos=tail;
   tail=new_Node;
   tail.next=null;
 }  
     
     public static void addFirstInDl() {
    	 Node new_Node1=new Node(0);
    	 
    	 if(head==null) {
    		 head=new_Node1;
    		 head.next=null;
    		 head.Previuos=null;
    	 }
    	 else {
    		 
    		 new_Node1.next=head;
    		 head.Previuos=new_Node1;
    		 head=new_Node1;
    		 
    	 }
    	 
    	 
     }
     public static void addMiddleInDL(Node prev) {
    	 Node new_Node2=new Node(9);
    	 if(head==null) {
    		 head=new_Node2;
    		 head.next=null;
    		 head.Previuos=null;
    	 } 
    	new_Node2.next=prev.next;
    	
    	new_Node2.Previuos=prev; 
    	prev.next=new_Node2;
    	
     }
     public static void deleteElementInDl(int d) {
			Node temp=head;
			Node Previuos = null;
			if(temp.data==d && head!=null)
			{
			
				head=temp.next;
				temp.next=null;
			}
			else
			{
			while(temp.data!=d){
				Previuos=temp;
				temp=temp.next;
			}
			Previuos.next=temp.next;
			
			temp.next=null;
			}
		}     
 public   static void display() {
   	 Node temp=head;
   	 while(temp!=null) {
   		 System.out.println(temp.data);
   		 temp=temp.next;
   	 }
    }
     
 
     public static void main(String[] args) {
		head=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		head.Previuos=null;
		head.next=two;
		
		two.Previuos=head;
		two.next=three;
		 
		three.Previuos=two;
		three.next=null;
		addLastInDL();
		addFirstInDl();
		addMiddleInDL(two.next);
		deleteElementInDl(3);
		
		display();
		
	}
} 
}
