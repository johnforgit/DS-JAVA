public class queuell extends node 
{
    static node front = null;
    static node rear = null;

    static void enqueue(int val) {
        node newNode = new node();
        newNode.data = val;
        if(rear == null)
            front = rear = newNode;
        else {
            rear.next = newNode;
            rear = newNode; // set the value of rear
        }
    }

    static void dequeue() { 
        if(front == null) 
            return;
        node temp = front;
        int val = temp.data;
        front = temp.next;
        temp = null;
        System.out.print(val);
        
        if(front == null) rear = null;
    }

    static void show() {
        node temp = front;
        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null)
                System.out.print("->");
                temp = temp.next; 
        }   
    }

    public static void main(String args[])
    {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        show();
        System.out.println();
        dequeue();
        System.out.println();
        show();
    }
}


