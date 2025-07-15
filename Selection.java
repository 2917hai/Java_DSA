import java.util.*;
public class Selection {
    public static void select(int arr[], int s)
    {
         for(int i=0; i<s; i++)
         {
            int chotu=i;
            for(int j=i+1; j<s; j++)
            {
                if(arr[j]<arr[chotu])
                {
                    chotu=j;
                }
            }
            if(chotu!=i)
            {
                int temp=arr[chotu];
                arr[chotu]=arr[i];
                arr[i]=temp;
            }
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[]{8,3,9,1,6,7,4};
        int s=arr.length;
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("after sorting");
        select(arr, s);
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
        
    }
}
