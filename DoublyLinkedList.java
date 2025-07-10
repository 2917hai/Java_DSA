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

    public void printForward(Node head)
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(" <==> " + temp.data);
            temp = temp.next;
        }
    }
    public void printBackward(Node tail)
    {
        Node temp = tail;
        while (temp != null) {
            System.out.print(" <==> " + temp.data);
            temp = temp.prev;
        }
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


        

        
    }
}
