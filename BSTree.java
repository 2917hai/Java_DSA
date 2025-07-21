/*
 * Binary Search tree->
 * A Binary Search tree is a type of binary tree where each node has:
 * 1). At most two children left and right 
 * 2). The left subtree contains values with less than the current node vlaue.
 * 3). THe right subtree contains only values with greater than current node values.\
 * 4). Incase of Binary Search tree if we use in
 */
public class BSTree
{
    int data;
    BSTree left;
    BSTree right;

    public BSTree(int d)
    {
        data=d;
        left=null;
        right=null;
    }

    public void preorder(BSTree root)
    {
         if(root==null)
         {
            return;
         }
         System.out.print(root.data+"===========>");
         preorder(root.left);
         preorder(root.right);

    }



      public void Inorder(BSTree root)
    {
         if(root==null)
         {
            return;
         }
        
         Inorder(root.left);
          System.out.print(root.data+"========>");
         Inorder(root.right);

    }




      public void postorder(BSTree root)
    {
         if(root==null)
         {
            return;
         }
         postorder(root.left);
         postorder(root.right);
         System.out.print(root.data+"=======>");


    }
    BSTree()
    {
      
    }

    public BSTree insert(BSTree root, int key)
    {
         if(root==null){
            // System.out.println("Root Node Inserted Success");
             return new BSTree(key);
         }
         else if(key<root.data){
             root.left=insert(root.left, key);
         }else if(key>root.data){
             root.right=insert(root.right,key);
         }
         return root;
    }
    public static void main(String []args)
    {
     BSTree root=null;
       BSTree t1=new BSTree();
      root= t1.insert(root,100);
       t1.insert(root, 90);
       t1.insert(root, 110);
       t1.insert(root, 80);
       t1.insert(root, 95);
       t1.insert(root, 105);
       t1.insert(root, 120);


      System.out.println("PreOrder");
      t1.preorder(root);
      System.out.println("Inorder");
      t1.Inorder(root);
      System.out.println("Postorder");
      t1.postorder(root);


    }
}
