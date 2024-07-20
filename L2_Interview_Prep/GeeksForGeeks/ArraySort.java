package L2_Interview_Prep.GeeksForGeeks;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr={0,2,1,2,0};
        changeArray(arr);
    }
// Selection Sort
  /*  private static void changeArray(int[] a) {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }*/
// Bubble Sort
/*    private static void changeArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }*/
// Insertion Sort
    private static void changeArray(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int value=arr[i];
            int index=i;
            while(index>0 && arr[index-1]>value)
            {
                arr[index]= arr[index-1];
                index--;
            }
            arr[index]=value;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

}
