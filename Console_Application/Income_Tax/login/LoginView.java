package login;

import java.util.Scanner;

public class LoginView {



    public  void menu()
    {
        new LoginModule().defaultAdd();
        Scanner sc=new Scanner(System.in);
        System.out.println("Tax Calculator");
        int user;
        do
        {
            System.out.println("Choose User:");
            System.out.println("1. Admin");
            System.out.println("2. TaxPayer");
            System.out.println("3.Exit");
            user=sc.nextInt();
            switch (user)
            {
                case 1:
                {
                    System.out.println("Admin");
                    System.out.println("Enter the Login");
                    sc.nextLine();
                    String pass=sc.nextLine();
                    new LoginModule().checkPass(pass);
                    break;
                }
                case 2:
                {
                    System.out.println("User Login");
                    System.out.println("Enter the Income");
                    int income=sc.nextInt();
                    int val=new LoginModule().calIncome(income);
                    System.out.println("Tax :"+val);
                    break;
                }
                case 3:
                {
                    System.exit(0);
                }
            }

        }while(user<3);
    }
public void showMessage(String msg)
{
    System.out.println(msg);
}
}
