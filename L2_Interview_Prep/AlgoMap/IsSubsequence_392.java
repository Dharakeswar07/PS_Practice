package L2_Interview_Prep.AlgoMap;

public class IsSubsequence_392 {
    public static void main(String[] args) {
        String str="b";
        String str1="abc";
        System.out.println(isSubsequence(str,str1));
    }
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
