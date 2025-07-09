public class Stack_dataStructure{
    int q[]=new int[5];
    int front=-1;
    int rear=-1;

    public void enq(int data)
    {
        if(rear==q.length-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
            if(front==-1 && rear==-1)
            {
                
                front++;
                rear++;
                q[rear]=data;
                System.out.println("Enqueued: " + data);
            }
            else
            {
                rear++;
                q[rear]=data;
                System.out.println("Enqueued: " + data);
            }
         
        }
    }
    public static void main(String [] args)
    {
       Stack_dataStructure st=new Stack_dataStructure();
       st.enq(10);
       st.enq(20);
       st.enq(30);
       st.enq(40);
       st.enq(50);

    }
}