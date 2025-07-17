public class Quick {
public static int divide(int arr[], int low, int high)
    {
    int pv=arr[low];
    int i=low+1;
    int j=high;
do
{
    while (arr[i]<pv)
    {
        i++;
    }
    while (arr[j]>pv)
    {
       j--;
    }
    if(i<j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    
     } while (i<j);
    int temp=arr[j];
    arr[j]=arr[low];
    arr[low]=temp;
    return j;
        
    }
    public static void quick(int arr[],int low, int high)
    {
      int pv;
      if(low<high)
      {
        pv=divide(arr,low,high);
        System.out.println(pv);
        quick(arr, pv+1, high);
        quick(arr, low, pv-1);
      }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{8,3,4,9,1,7,6};
        int s=arr.length;
        System.out.println("before sorting");
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("after sorting");
        int low=arr[0];
        int high=arr[s-1];
        quick( arr, low, high);
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
    }
}
