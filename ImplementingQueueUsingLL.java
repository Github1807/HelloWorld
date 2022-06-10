
public class ImplementingQueueUsingLL
{
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node front, rear;
    ImplementingQueueUsingLL()
    {
        this.front = this.rear = null;
    }
    void enqueue(int data)
    {
        Node temp = new Node(data);
        if (this.rear == null)
        {
        this.front = this.rear = temp;
        return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    void dequeue()
    {
        if (this.front == null)
        {
            return;
        }
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
        {
            this.rear = null;
        }
    }
    void display()
    {
        if (front == null)
        {
            System.out.println("Queue Underflow");
            return;
        }
        else
        {
            ImplementingQueueUsingLL.Node temp = front;
            while (temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    void Search(int a)
    {
        ImplementingQueueUsingLL.Node demo = front;
        int count = 0;
        while(demo!=null)
        {
            if(demo.data==a)
            {
                System.out.println("Found");
                count++;
            }
            demo = demo.next;
        }
        if(count==0)
        {
            System.out.println("Not Found");
        }

    }

    public static void main(String[] args)
    {
        ImplementingQueueUsingLL q = new ImplementingQueueUsingLL();
        q.enqueue(7);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(9);
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(76);
        q.enqueue(11);
        q.enqueue(73);
        q.dequeue();
        q.display();
        q.Search(11);
    }
}
