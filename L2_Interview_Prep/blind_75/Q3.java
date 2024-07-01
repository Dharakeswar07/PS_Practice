package L2_Interview_Prep.blind_75;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        int[] num={-1,0,1,2,-1,-4};
        List<List<Integer>> lst=threeSum(num);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst=new ArrayList<>();
        List<Integer> inlst=new ArrayList<>();

        if(nums.length< 3 ) return lst;
        for(int i=0;i< nums.length;i++)
        {
            for(int j=i+1;j< nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length-2;k++)
                {
                    if(i!=j && j!=k && i!=k)
                    {
                        
                    }
                }
            }
        }
    }
}
