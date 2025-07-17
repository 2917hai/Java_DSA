

public class doublyln {
    private doublyln prev;
    private int data;
    private doublyln next;

    public doublyln(int data){
        prev=null;
        this.data=data;
        next=null;
    }
    public void printForward(doublyln head){
        doublyln temp=head;
        while (temp!=null){
            System.out.print("===>"+temp.data);
            temp=temp.next;

        }
        System.out.println("");
    }
    public doublyln addFirst(doublyln head,int k){
        doublyln newNode=new doublyln(k);
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
        return head;
    }
  public void AddEnd(doublyln tail,int e){
        doublyln newNode=new doublyln(e);
         doublyln temp=tail;
         newNode.prev=temp;
         temp.next=newNode;
  }
  public void InsertPos(doublyln head,int pos,int i){
        doublyln newNode=new doublyln(i);
        pos--;
        doublyln temp1=head;
        doublyln temp2=head.next;
        while (pos>1){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.next=newNode;
        newNode.prev=temp1;
        newNode.next=temp2;
        temp2.prev=newNode;

  }
    public void printBackward(doublyln tail){
        doublyln temp=tail;
        while (temp!=null){
            System.out.print("===>"+temp.data);
            temp=temp.prev;
        }

    }
    public doublyln Delete(doublyln head){
        doublyln Newnode=head.next;
        head.next=Newnode;
        Newnode.prev=null;
        return Newnode;


    }
    

    public static void main(String[] args) {
        doublyln f1=new doublyln(10);
        doublyln f2=new doublyln(20);
        doublyln f3=new doublyln(30);
        doublyln f4=new doublyln(40);
        f1.next=f2;
        f2.prev=f1;
        f2.next=f3;
        f3.prev=f2;
        f3.next=f4;
        f4.prev=f3;
        doublyln head=f1;
       

//        head.printForward(head);
//        head.printBackward(tail);
//        head=head.addFirst(head,5);
//        head.printForward(head);
//        tail.AddEnd(tail,50);
//        tail.printForward(head);
        head.InsertPos(head,2,5);
        head.printForward(head);
        head=head.Delete(head);
        head.printForward(head);

    }
}