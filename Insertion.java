import java.util.*;
public class Insertion {
    public static void select(int[] arr, int s)
    {
        for(int i=1; i<s; i++)
        {
            int chotu=i;
            while(chotu>0 && arr[chotu]<arr[chotu-1])
            {
                int temp=arr[chotu];
                arr[chotu]=arr[chotu-1];
                arr[chotu-1]=temp;
                chotu--;
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
