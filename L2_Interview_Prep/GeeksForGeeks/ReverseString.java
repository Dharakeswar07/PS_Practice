package L2_Interview_Prep.GeeksForGeeks;

public class ReverseString {
    public static void main(String[] args) {
        String str="Dharakes";
        System.out.println(reverseString(str));
    }
// Method 1:
/*    private static String reverseString(String str) {
        String res="";
        char[] arr=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--)
        {
            res+=arr[i];
        }
        return res;
    }*/


  // Method --2
    private static String reverseString(String str)
    {
        String res="";
        for(int i=0;i<str.length();i++)
        {
            int n=(str.length()-1)-i;
            res+=str.charAt(n);
        }
              return res;
    }


}
