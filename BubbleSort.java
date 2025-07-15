public class BubbleSort {
    public static void bsort(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,3,8,9,1,4};
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        bsort(arr);
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
        
    }
}
