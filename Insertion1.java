public class Insertion1 {
    public static void insert(int arr[],int s)
    {
      for(int i=1; i<s; i++)
      {
        int min=i;
        while(min>0 && arr[min]<arr[min-1])
        {
            int temp=arr[min];
            arr[min]=arr[min-1];
            arr[min-1]=temp;
            min--;
        }
      
      }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,8,3,7,1,9,6,4};
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        int s=arr.length;
        System.out.println();
        System.out.println("after sorting");
        insert(arr,s);
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }

    }
}
