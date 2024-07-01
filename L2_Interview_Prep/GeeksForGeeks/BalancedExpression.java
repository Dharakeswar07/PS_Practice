package L2_Interview_Prep.GeeksForGeeks;

import java.util.Stack;

public class BalancedExpression {
    public static void main(String[] args) {
        String str="[[[";
        if(checkBalance(str))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }
    public static Boolean checkBalance(String s)
    {
        Stack<Character>  stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='[' || ch=='{' || ch=='(')
            {
                stack.push(ch);
            }
            else if((!stack.empty()) && ((stack.peek()=='[' && ch==']') || (stack.peek()=='{' && ch=='}') || (stack.peek()=='(' && ch==')')))
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        return stack.empty();
    }

}
