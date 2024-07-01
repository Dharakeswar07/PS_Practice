package L2_Interview_Prep.blind_75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q217 {
    public static void main(String[] args) {
        int[] num={1,2,3,1};
        System.out.println(containsDuplicate2(num));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                return true;
            }
            map.put(i,i);
        }
        return  false;
    }
    public static boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=1) return false;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
                return  false;
    }

    public static boolean containsDuplicate2(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int i:nums)
       {
           if(set.contains(i))
           {
               return true;
           }
           set.add(i);
       }
       return  false;
    }
}
