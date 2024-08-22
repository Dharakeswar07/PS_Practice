package taxSlabs;

import login.LoginView;

import java.util.Scanner;

public class TaxSlabsView {
    public static void showMenu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Admin Login");
        int ch;
        do {
            System.out.println("Tax Slabs");
            System.out.println("1.Add");
            System.out.println("2.Edit");
            System.out.println("3.view");
            System.out.println("4.Remove Slab");
            System.out.println("5.Back");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println("Enter the Number to need to add:");
                    int count=sc.nextInt();
                    for(int i=0;i<count;i++)
                    {
                        System.out.println("Income Bracket");
                        int amount=sc.nextInt();
                        System.out.println("Percentage");
                        int percentage=sc.nextInt();
                        new TaxSlabsModule().addtax(amount,percentage);
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the Number of Data need to Change");
                    int count=sc.nextInt();
/*                    new TaxSlabsModule().removeTax();*/
                    for(int i=0;i<count;i++)
                    {
                        System.out.println("Enter the Income Bracket to Change");
                        int val=sc.nextInt();
                        System.out.println("Income Bracket");
                        int amount=sc.nextInt();
                        System.out.println("Percentage");
                        int percentage=sc.nextInt();
                        new TaxSlabsModule().edittax(val,amount,percentage);
                    }

                    break;
                }
                case 3:
                {
                    System.out.println("Tax Slabs");
                    new TaxSlabsModule().showTax();
                    break;
                }
                case 4:
                {
                    System.out.println("Remove Slab");
                    System.out.println("Enter the Amount Slab to remove:");
                    int amount=sc.nextInt();
                    new TaxSlabsModule().removeTax(amount);
                }
                case 5:
                {
                new LoginView().menu();
                }
                default:
                {
                    System.out.println("Select the Correct Option");
                    showMenu();
                    break;
                }
            }

            System.out.println();

        }while(ch<4);
    }
}
