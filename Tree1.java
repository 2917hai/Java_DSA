public class Tree1
{
    int data;
    Tree1 left;
    Tree1 right;

    public Tree1(int d)
    {
        data=d;
        left=null;
        right=null;
    }

    public void preorder(Tree1 root)
    {
         if(root==null)
         {
            return;
         }
         System.out.print(root.data+"===========>");
         preorder(root.left);
         preorder(root.right);

    }



      public void Inorder(Tree1 root)
    {
         if(root==null)
         {
            return;
         }
        
         Inorder(root.left);
          System.out.print(root.data+"========>");
         Inorder(root.right);

    }




      public void postorder(Tree1 root)
    {
         if(root==null)
         {
            return;
         }
         postorder(root.left);
         postorder(root.right);
         System.out.print(root.data+"=======>");


    }
    public static void main(String []args)
    {
      Tree1 t1=new Tree1(10);
      Tree1 t2=new Tree1(20);
      Tree1 t3=new Tree1(30);
      Tree1 t4=new Tree1(40);
      Tree1 t5=new Tree1(50);
      Tree1 t6=new Tree1(60);
      Tree1 t7=new Tree1(70);

       t1.left=t2;
        t1.right=t3;
        t1.left.left=t4;
        t1.left.right=t5;
        t1.right.left=t6;
        t1.right.right=t7;
      System.out.println("PreOrder");
      t1.preorder(t1);
      System.out.println("Inorder");
      t1.Inorder(t1);
      System.out.println("Postorder");
      t1.postorder(t1);


    }
}