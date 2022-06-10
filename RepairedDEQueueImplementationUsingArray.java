public class RepairedDEQueueImplementationUsingArray {
	    static int dq[]=new int[10];
	    static int  front=-1;
	    static int rear=-1;
	    public  static boolean isempty() {
	        if (front == -1 && rear == -1)
	            return true;
	        else
	            return false;
	    }
	    public static void rearEnqueue(int value) {
	        if(front > rear) {
	            System.out.println("Queue Overflow");
	        }
	        else if(isempty()) {
	            dq[0] = value;
	            ++front;
	            ++rear;
	        }
	        else {
	            rear = rear + 1;
	            dq[rear] = value;
	        }
	    }

	    public static void frontEnqueue(int value) {
	        if(rear == (dq.length - 1)) {
	            System.out.println("Queue Overflow");
	        }
	        else if(isempty()) {
	            dq[0] = value;
	            front++;
	            rear++;
	        }
	        else {
	            for(int i = rear; i >= front ; i--) {
	                dq[i + 1] = dq[i];
	            }
	            dq[front] = value;
	            ++rear;
	        }
	    }

	    public static int frontDequeue() {
	        if(front > rear) {
	            System.out.println("Queue Underflow");
	            front = -1;
	            rear = -1;
	            return -1;
	        }
	        int value = dq[front];
	        for(int i = 0; i <= rear - 1; i++) {
	            dq[i] = dq[i + 1];

	        }
	        dq[rear] = 0;
	        --rear;

	        return value;
	    }

	    public static int rearDequeue() {
	        if(front > rear) {
	            System.out.println("Queue Underflow");
	            return -1;
	        }
	        int value = dq[rear];
	        dq[rear] = 0;
	        rear--;
	        return value;
	    }

	    public static int search(int value) {
	        int c = 0;

	        for(int i = 0; i <= rear; i++) {
	            if(dq[i] == value) {
	                c = 1;
	                break;
	            }
	        }
	        return c;
	    }

	    public static void display() {
	        for(int i : dq) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        rearEnqueue(12);
	        display();

	        rearEnqueue(22);
	        display();

	        rearEnqueue(4);
	        display();

	        frontEnqueue(55);
	        display();

	        frontEnqueue(11);
	        display();

	        System.out.println("Front Dequeued element: " + frontDequeue());
	        display();

	        System.out.println("Rear Dequeued element: " + rearDequeue());
	        display();

	        int value = search(55);
	        if(value == 1) System.out.println("Element Found");
	        else System.out.println("Element Not Found");
	    }




	}

