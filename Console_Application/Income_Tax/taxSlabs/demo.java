package taxSlabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<List<Integer>> arr=new ArrayList<>();

        arr.add(List.of(10000,10));
        arr.add(List.of(10000,10));
        arr.add(List.of(10000,10));
        arr.add(List.of(10000,10));

        for(List<Integer> lst1:arr)
        {
            for(int i:lst1)
            {
                System.out.print(i+"        ");
            }
            System.out.println();
        }
        arr.clear();
        if(arr.isEmpty())
        {
            System.out.println("1");
        }

    }
}
