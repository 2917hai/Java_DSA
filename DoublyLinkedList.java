public class DoublyLinkedList {
class Node {
    private int data;
    private Node next;
    private Node prev;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }   



    //////////////////////////   printForward and printBackward methods ////////////////////////
    public void printForward(Node head)
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(" <==> " + temp.data);
            temp = temp.next;
        }
    }



    ////////////////////////////   printBackward method ////////////////////////
    public void printBackward(Node tail)
    {
        Node temp = tail;
        while (temp != null) {
            System.out.print(" <==> " + temp.data);
            temp = temp.prev;
        }
    }



    ///////////////////////////////////////////  addStart method ////////////////////////////////////////
    
    public Node addStart(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode; 
        }
        newNode.next = head; 
        head.prev = newNode; 
        return newNode; 
    }

         ///////////////////////////////////////////  addEnd method ////////////////////////////////////////
   
         public Node addEnd(Node tail, int data)
    {
        Node newNode =new Node(data);
        if(tail == null) {
            return newNode; 
        }
        tail.next = newNode;
        newNode.prev = tail;
        return newNode;
    }



      ///////////////////////////////////////////  addFixedPosition method ////////////////////////////////////////
    
public void addFixedPosition(Node head, int data, int position)
{
    Node newNode = new Node(data);
    position--;
    Node current = head;
    while(position >1 && current != null) {
        current = current.next;
        position--;
    }
    if (current == null) {
        System.out.println("Position is out of bounds.");
        return;
    }
    
    newNode.next = current.next;
    current.next.prev=newNode;
    current.next = newNode;
    newNode.prev = current;


}


  ///////////////////////////////////////////  deleteStart method ////////////////////////////////////////
    

  public Node deleteStart(Node head)
  {
    if(head == null)
    {
        System.out.println("List is empty, nothing to delete.");
        return null; 
    }
    if(head.next == null) {
        return null; 
    }
    Node newhead=head.next;
    newhead.prev=null;

    return newhead;
  }

     ///////////////////////////////////////////  deleteEnd method ////////////////////////////////////////
    
     public Node deleteEnd(Node tail)
     {
        if(tail==null)
        {
            System.out.println("List is empty, nothing to delete.");
            return null; 
        }
        if(tail.prev==null)
        {
            return null;
        }
        Node newTail=tail.prev;
        newTail.next=null;
        return newTail;
     }

      ///////////////////////////////////////////  deleteFixedPosition method ////////////////////////////////////////
      public void deleteFixedPosition(Node head, int position)
      {
        position--;
        Node current =head;
        while(position > 1 && current != null) {
            current = current.next;
            position--;
        }
      
        current.next= current.next.next;
        current.next.next.prev = current;
      }

}
    public static void main(String[] args) {
        System.out.println();
        DoublyLinkedList dll = new DoublyLinkedList();
        Node f1= dll.new Node(10);
        Node f2= dll.new Node(20);
        Node f3= dll.new Node(30);
        Node f4= dll.new Node(40);

        Node f5= dll.new Node(50);
        f1.next= f2;
        f2.prev= f1;

        f2.next= f3;
        f3.prev= f2;

        f3.next= f4;
        f4.prev= f3;

        f4.next= f5;
        f5.prev= f4;

        Node head = f1;
        Node tail = f5;

        System.out.println("Forward Traversal:");
        head.printForward(head);
        System.out.println("\nBackward Traversal:");
        tail.printBackward(tail);
        System.out.println();

        head = head.addStart(head, 5);
        System.out.println("After adding at start:");
        head.printForward(head);


        tail = tail.addEnd(tail, 60);
        System.out.println("\nAfter adding at end:");
          head.printForward(head);
       

        System.out.println("\nAdding at fixed position:");
        head.addFixedPosition(head, 25, 3); 
        head.printForward(head);

        
        head= head.deleteStart(head);
        System.out.println("\nAfter deleting start:");
        head.printForward(head);


        tail = tail.deleteEnd(tail);
        System.out.println("\nAfter deleting end:");
        head.printForward(head);


        System.out.println("\nDeleting at fixed position:");
        head.deleteFixedPosition(head, 3);
        head.printForward(head);

        
    }
}
