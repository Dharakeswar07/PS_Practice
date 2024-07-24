package L2_Interview_Prep.GeeksForGeeks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDistinctCount {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={1,2,3};
        System.out.println(doUnion(arr,arr1));
    }
   /* private static int doUnion(int arr1[], int arr2[])
    {
        int[] res=new int[arr1.length+arr2.length];
        int j=0;
        for(int i=0;i<arr1.length;i++)
        {
            res[j++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            res[j++]=arr2[i];
        }
        Arrays.sort(res);
        int count=1;
        for(int i=1;i<res.length;i++)
        {
            if(res[i]!=res[i-1])
            {
                count++;
            }

        }
        return count;
    }*/

    private static int doUnion(int[] arr1,int[] arr2)
    {
        Set<Integer> set=new HashSet<>();
        for(int i:arr1)
        {
            set.add(i);
        }
        for(int i:arr2)
        {
            set.add(i);
        }
        return set.size();
    }
}
