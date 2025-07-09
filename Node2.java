// public class Node1 {
//     private int data;
//     private Node1 next;

//     public Node1(int data)
//     {
//         this.data = data;
//         next = null;
//         System.out.println("Node Created ");
//     }

//     public void Show(Node1 head)
//     {
//         Node1 temp= head;
//         while(temp!=null)
//         {
//             System.out.print("====>" + temp.data); // 10===>20====>30
//             temp = temp.next;
//         }

//     }

//     public void addStart(int data, Node1 head) {
//         Node1 newnode = new Node1(data);
//         newnode.next = head;
//         head = newnode; 
//     }

//     public void addEnd(int data, Node1 head)
//     {
//         Node1 newnode=new Node1(data);
//         Node1 temp=head;
//         while(temp.next!=null)
//         {
//             temp=temp.next;
//         }
//         temp.next=newnode;
//     }
   
//     public static void main(String[] args) {
//         Node1 f1 = new Node1(10);
//         Node1 f2 = new Node1(20);
//         Node1 f3 = new Node1(30);
//         Node1 f4 = new Node1(40);
//         Node1 f5 = new Node1(50);
//        Node1 head=f1;

//     f1.next=f2;
//     f2.next=f3;
//     f3.next=f4;
//     f4.next=f5;

//         head.Show(head);

//         head.addStart(5, head);
//         System.out.println("\nAfter adding at start:");
//         head.Show(head);
//         head.addEnd(60, head);
//         System.out.println("\nAfter adding at end:");
      

        
//     }
// }

































public class Node2{

    int data;
    Node2 next;

    public Node2(int data)
    {
        this.data=data;
        next =null;
    }

    public void show(Node2 head)
    {
        Node2 temp=head;
        while(temp!=null)
        {
            System.out.print("====>" + temp.data); 
            temp=temp.next;
        }
    }
    public void addStart(Node2 head)
    {
        Node2 newNode=new Node2(5);
        newNode.next=head;
        head=newNode;
    }

    public void addEnd(Node2 head)
    {
        Node2 newNode=new Node2(60);
        Node2 temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void addFixedPosition(Node2 head, int position,int data)
    {
        Node2 newNode=new Node2(data);
       Node2 temp1=head;
       Node2 temp2=temp1.next;
       position--;
       while(position>1)
       {
        temp1=temp1.next;
        temp2=temp2.next;
        position--;
       }
       temp1.next=newNode;
       newNode.next=temp2;
    }
/////////////////////  Delete First Node ///////////////////////
    public Node2 deleteFirst(Node2 head)
    {
        if(head == null) {
            System.out.println("List is empty");
            
        } 
        head = head.next; 
        System.out.println("First node deleted");
        return head;
    } 


    ///////////////////////  Delete Last Node ///////////////////////
    public Node2 deleteLast(Node2 head) 
    {
        if(head == null) {
            System.out.println("List is empty");
           
        }
        if(head.next==null)
        {
            head=null;
        }
        else{
            Node2 temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        return head;
    }

    public static void main(String[] args) {
        Node2 f1=new Node2(10);
        Node2 f2=new Node2(20);
        Node2 f3=new Node2(30);
        Node2 f4=new Node2(40);
        Node2 f5=new Node2(50);
        Node2 head=f1;
        f1.next=f2;
        f2.next=f3;
        f3.next=f4; 
        f4.next=f5;
        f5.next=null;
        head.show(head);

        head.addStart(head);
        System.out.println("\nAfter adding at start:");
        head.show(head);    
        head.addEnd(head);
        System.out.println("\nAfter adding at end:");

        head.addFixedPosition(head, 3,25);
          head.show(head);

        head = head.deleteFirst(head);
        System.out.println("\nAfter deleting first node:");
         head.show(head);

        head = head.deleteLast(head);
        System.out.println("\nAfter deleting last node:");
         head.show(head);
             
        
    }
}
