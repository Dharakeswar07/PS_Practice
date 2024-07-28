package L2_Interview_Prep.Sheet;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=10;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
