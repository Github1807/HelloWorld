
public class ImplementingPriorityQueueUsingLL {
	
	int q[] = new int[5];
	static int top = 0;
	void enqueue(int a)
		{
		if(top>4)
		{
		System.out.println("Overflow condition");
		return;
		}
		else
		{
		q[top]=a;
		for(int i = 0; i < top; i++)
		{
		for (int j = i + 1; j < top+1;j++)
		{
		int temp = 0;
		if (q[j] < q[i])
		{
		temp = q[i];
		q[i] = q[j];
		q[j] = temp;
		}
		}
		}
		top++;
		}
	}
	void dequeue()
		{
		if(top==-1)
		{
		System.out.println("Underflow condition");
		}
		else
		{
		for (int i = 0;i<top;i++)
		{
		q[i]=q[i+1];
		}
		top--;
		}
	}
	void display()
		{
		for(int i = 0;i<top;i++)
		{
		System.out.print(q[i]+" ");
		}
		System.out.println();
	}
	void Search(int a)
		{
		int count=0;
		for(int i =0;i<=top;i++)
		{
		if (q[i] == a) {
		System.out.println("Found");
		count++;
		}
		}
		if(count==0)
		{
		System.out.println("Not Found");
		}
	}
	void isempty()
		{
		if(top==-1)
		{
		System.out.println("Queue Empty");
		}
		else
		{
		System.out.println("Not Empty");
		}
	}
	public static void main(String[] args)
	{
		ImplementingPriorityQueueUsingLL pQueue= new ImplementingPriorityQueueUsingLL();
		pQueue.enqueue(2);
		pQueue.enqueue(14);
		pQueue.enqueue(26);
		pQueue.enqueue(81);
		pQueue.display();
		pQueue.dequeue();
		pQueue.enqueue(3);
		pQueue.display();
		pQueue.Search(9);
		pQueue.Search(81);
		pQueue.isempty();
	}
}
