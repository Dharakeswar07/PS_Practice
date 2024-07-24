package L2_Interview_Prep.GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3};
        ArrayList<Integer> lst=duplicate(arr);
        for(int i:lst)
        {
            System.out.print(i+" ");
        }
    }

    private static ArrayList<Integer> duplicate(int[] arr) {
        ArrayList<Integer> lst=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                lst.add(arr[i]);
            }
        }
        if(lst.isEmpty())
        {
            lst.add(-1);
        }
        return lst;
    }
}
