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
/*
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
*/


    // Quick Sort
    private static void changeArray(int[] arr)
    {
        int n=arr.length;
        quickSort(arr, 0, n-1);
    }

    // Quick Sort function
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Utility function to print array of size n
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
