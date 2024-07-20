package L2_Interview_Prep.Others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestChainPairs {
    public static void main(String[] args) {

        List<int[]> lst=new ArrayList<>();
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Count of the Pairs:");
        int c=sc.nextInt();
        System.out.println("Enter all the Pairs");
        for(int i=0;i<c;i++)
        {
            System.out.println("Enter the Pair :"+(i+1));
            int[] arr=new int[2];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            lst.add(arr);
        }*/
        lst.add(new int[]{39, 60});
        lst.add(new int[]{15, 28});
        lst.add(new int[]{5, 24});
        lst.add(new int[]{27, 40});
        lst.add(new int[]{50, 90});
        System.out.println(" The Longest Chain link Count is :" +getCount(lst) );
    }

    private static int getCount(List<int[]> lst) {
        lst.sort((a, b) -> a[1] - b[1]);

        int count = 1;
        int[] lastPair = lst.get(0);

        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i)[0] > lastPair[1]) {
                count++;
                lastPair = lst.get(i);
            }
        }

        return count;
    }
}
