public class EnqueNDequeEx {
	static int q[]= new int[10];
	static int rear;
	static int front=rear=-1;
	public static boolean qEmpty() {
		if(front==-1 && rear==-1) {
			return true;
		}
		else {
				return false;
		}
	}
	public static void enque(int a) {
		if(rear==q.length) {
			System.out.println("Overflow");
		}
		else {
		if(qEmpty()) {
			++front;
			}
		++rear;
			q[rear]=a;
		}
	}
		

	public static int deque() {
		
		if(front>rear) {
			front=-1;
			rear=-1;
			System.out.println("Q MT");
		}
		int a=q[front];
		++front;
		return a;
				
	}
		
	public static void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(q[i]+" ");
		}
	}
		public static void main(String[] args) {
		enque(3);
		enque(4);
		enque(6);
		enque(7);
		int a=deque();
		System.out.println("No dequed "+a);
		System.out.println(peek());
		System.out.println(search(6));
		display();
		
	}

}
