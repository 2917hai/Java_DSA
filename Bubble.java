import java.util.*;
public class Bubble {
    public static void bubble(int arr[], int s)
    {
        for(int i=0; i<s; i++)
        {
            for(int j=0; j<s-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0; i<s; i++)
        {
            arr[i]=sc.nextInt();
        }
       
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("after sorting data");
         bubble(arr,s);
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
    }
}
