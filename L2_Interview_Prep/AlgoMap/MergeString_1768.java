package L2_Interview_Prep.AlgoMap;

public class MergeString_1768 {
    public static void main(String[] args) {
        String str="ab";
        String str1="pqrst";
        System.out.println(mergeAlternately(str,str1));
    }

    // Method --> 1
  /*  public static String mergeAlternately(String str, String str1) {
       String res="";
        if(str.length()==str1.length())
        {
            for(int i=0;i<str.length();i++)
            {
                res+=str.charAt(i);
                res+=str1.charAt(i);
            }
        }else
        {
            if(str.length()<str1.length())
            {
                for(int i=0;i<str.length();i++)
                {
                    res+=str.charAt(i);
                    res+=str1.charAt(i);
                }
                res+=str1.substring(str.length(),str1.length());
            }else
            {
                for(int i=0;i<str1.length();i++)
                {
                    res+=str.charAt(i);
                    res+=str1.charAt(i);
                }
                res+=str.substring(str1.length(),str.length());
            }
        }
        return res;
    }*/

    // Method --> 2
   /* public static String mergeAlternately(String str, String str1) {
    String res="";
    int max=Math.max(str.length(),str1.length());
    int i=0;
    while(true)
    {
        if(i<str.length())
        {
            res+=str.charAt(i);
        }
        if(i<str1.length())
        {
            res+=str1.charAt(i);
        }
        if(i>max) break;
        i++;
    }
    return res;
    }*/

    // Method --> 3
    public static  String mergeAlternately(String str,String str1)
    {
        StringBuilder b = new StringBuilder();

        int i = 0, j = 0;
        int m = str.length();
        int n = str1.length();

        for(; i < m || j < n; ){
            if( i < m ) b.append(str.charAt(i++));

            if( j < n ) b.append(str1.charAt(j++));
        }

        return b.toString();
    }

}
