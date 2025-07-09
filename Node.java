
public class Node {
    private int data;
    private Node next;
   
    public Node(int data){
        this.data=data;
        next=null;
        System.out.println("Node Created ");
    }
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print("====>"+temp.data);//10===>20====>30
            temp=temp.next;
        }
    }
    public Node addStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    public void addEnd(Node head, int data) {
       Node newNode = new Node(data);
       Node temp=head;
       while (temp.next != null) {
           temp = temp.next;
        
       }
         temp.next = newNode;
    }
    public static void main(String[] args) {
        Node f1=new Node(10);
        Node f2=new Node(20);
        Node f3=new Node(30);
        Node f4=new Node(40);
        Node f5=new Node(50);
        f1.next=f2;
        f1.next.next=f3;
        f1.next.next.next=f4;
        f1.next.next.next.next=f5;
        Node head=f1;
        head.display(head);
    }
}