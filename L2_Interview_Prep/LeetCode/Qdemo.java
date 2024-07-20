package L2_Interview_Prep.LeetCode;

public class Qdemo {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        String temp=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(temp)!=0)
            {
                temp=temp.substring(0,temp.length()-1);
                if(temp.isEmpty())
                {
                    System.out.println("");
                }
            }
        }
        System.out.println(temp);
    }
}
