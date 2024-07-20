package L2_Interview_Prep.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q1823 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
    public static int findTheWinner(int n, int k) {
      /*  List<Integer> players = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }

        int index = 0;
        while (players.size() > 1) {
            index = (index + k - 1) % players.size();
            players.remove(index);
        }

        return players.get(0);*/
        if(n==1) return 1;
        return (findTheWinner(n-1,k)+k-1)%n+1;
    }
}
