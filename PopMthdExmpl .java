public class PopMthdExmpl {
	static int arr[]= new int[10];
	static int top=-1;
	public static void push(int num) {
		if(top>arr.length-1) {
			System.out.println("Stack Overflow");
			return;
		}
		else {
		top=top+1;
		arr[top]=num;
		//arr[--top]=num;
		System.out.println("Element Inserted in stack "+num);
	}
}
	static int pop() {
		if(top<-1) {
			System.out.println("Stack underflow");
		return -100;	
	}
		else {
		
		int a=arr[top--];
		return a;
		//System.out.println("Element Inserted in stack "+a);
	}
	}
	public static void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int peek() {
		return arr[top];
	}
	public static String search(int num) {
		String c="Not Found";
		
		for(int i=0;i<=top;i++) {
			
			c=arr[i]==num?"Found":"Not Found";
			if(c.equalsIgnoreCase("Found")) {
				break;
			}
		}
			return c;
	}

	public static void main(String[] args) {
		push(3);
		push(4);
		push(6);
		push(7);
		int a=pop();
		System.out.println("No Popped "+a);
		System.out.println(peek());
		System.out.println(search(6));
		display();
		
	}
}
