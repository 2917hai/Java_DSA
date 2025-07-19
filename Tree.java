public class Tree {
    int data;
    Tree left;
    Tree right;

    public Tree(int d)
    {
        data=d;
        left=null;
        right=null;
    }

    public void preorder(Tree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public void Inorder(Tree root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);

    }

    public void Postorder(Tree root)
    {
        if(root==null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data);
    }

    public static void main(String[] args) {
        Tree t1=new Tree(10);
         Tree t2=new Tree(20);
          Tree t3=new Tree(30);
           Tree t4=new Tree(40);
            Tree t5=new Tree(50);
             Tree t6=new Tree(60);
              Tree t7=new Tree(70);
        t1.left=t2;
        t1.right=t3;
        t1.left.left=t4;
        t1.left.right=t5;
        t1.right.left=t6;
        t1.right.right=t7;

        System.out.println("PreOrder Tree");
        t1.preorder(t1);
        System.out.println("Inorder");
        t1.Inorder(t1);
        System.out.println("PostOrder");
        t1.Postorder(t1);
        
    }
}
