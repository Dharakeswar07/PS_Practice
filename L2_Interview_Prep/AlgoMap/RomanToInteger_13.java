package L2_Interview_Prep.AlgoMap;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        String str="D";
        String str1="LVIII";
        String str2="MCMXCIV";
        String str3="MDCXCV";
        System.out.println(romanToInt(str));
        System.out.println(romanToInt(str1));
        System.out.println(romanToInt(str2));
        System.out.println(romanToInt(str3));
    }
    // Method --> 1
   /* public static int getValue(char ch)
    {
        Map<Character,Integer> lst=new HashMap<>();
        lst.put('I',1);
        lst.put('V',5);
        lst.put('X',10);
        lst.put('L',50);
        lst.put('C',100);
        lst.put('D',500);
        lst.put('M',1000);
        if(lst.containsKey(ch))
        {
            return lst.get(ch);
        }
        return 0;
    }*/

  /*  public static int romanToInt(String s) {
        int val=0;
        if(s.length()<2) return getValue(s.charAt(0));
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X'))
            {
                val+=getValue(s.charAt(i+1))-getValue(s.charAt(i));
                i++;
            }
            else if(s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C'))
            {
                val+=getValue(s.charAt(i+1))-getValue(s.charAt(i));
                i++;
            }
            else if(s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M'))
            {
                val+=getValue(s.charAt(i+1))-getValue(s.charAt(i));
                i++;
            }
            else
            {
                 val+=getValue(s.charAt(i));
            }
            if(i==s.length()-2)
            {
                val+=getValue(s.charAt(i+1));
            }
        }
        return val;
    }*/

    // Method --> 2
    public static int getValue(char c)
    {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }

    public static int romanToInt(String s) {
        int val=0;
            if(s.length()<2) return getValue(s.charAt(0));
        for(int i=s.length()-2;i>=0;i--) {
            int temp = getValue(s.charAt(i+1));
            int next = getValue(s.charAt(i));
            if (temp > next) {
                val += temp - next;
                i--;
            } else {
                val += temp;
            }
            if (i == 0) {
                val += getValue(s.charAt(0));
            }
        }
        return  val;
    }
}
