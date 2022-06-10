import java.util.LinkedList;
public class LLexmpls {
		
		static Node head;
		static Node tail;
		
		static class Node{
			
			int data;
			Node n;
		

		public Node(int data) {
				
			this.data=data;
			//this.n=null;
			
			}

		}	
		
		
		
		public static void addFirst() {
			Node new_node=new Node(0);
			if(head==null) {
				head= new_node;
				new_node.n=null;
				return;
				
			}
			new_node.n=head;
			head=new_node;
			
		}

		public static void addLast() {
			Node new_node1=new Node(4);
			if(head==null) {
				head= new_node1;
				
				return;
			}
			new_node1.n=null;
			Node temp=head;
			while(temp.n!=null) {
				
				 temp= temp.n;
			}
			temp.n=new_node1;
			
			
		}
		public static void addMiddle(Node prev) {
			Node new_node2=new Node(10);
			if(head==null) {
				head= new_node2;
				return;
			}
			new_node2.n=prev.n;
			prev.n=new_node2;
		}	
		public static void deleteEle(int d) {
			Node temp=head;
			Node prev = null;
			if(temp.data==d && head!=null)
			{
			
				head.n=temp.n;
				temp.n=null;
			}
			else
			{
			while(temp.data!=d){
				prev=temp;
				temp=temp.n;
			}
			prev.n=temp.n;
			temp.n=null;
			}
		}
				
		public static void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				 temp= temp.n;
			}
		//	System.out.println(temp.data);
		
			
		}
		
		public static void main(String[] args) {
			head=new Node(1);
			Node two=new Node(2);
			Node three=new Node(3); 
			
			head.n=two;
			two.n=three;
			
			addFirst();
			
			addLast();
			addMiddle(two.n);
			deleteEle(4);
			display();
			
		}
		
		
	


}
