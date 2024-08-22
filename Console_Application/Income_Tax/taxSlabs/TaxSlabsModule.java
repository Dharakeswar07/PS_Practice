package taxSlabs;

import db.DbData;

import java.util.List;

public class TaxSlabsModule {
    private static DbData dbData=new DbData().getInstance();

    public void edittax(int val,int amount, int percentage) {
        List<int[]> lst=dbData.getSlabs();
        for(int[] arr:lst)
        {
            if(arr[0]==val)
            {
                arr[0]=amount;
                arr[1]=percentage;
            }
        }
    }

    public void showTax() {
        List<int[]> lst=dbData.getSlabs();
        System.out.println("Income Bracket  |   Tax  Slabs");
        for(int[] arr:lst)
        {
            for(int i:arr)
            {
                System.out.print(i+"        ");
            }
            System.out.println();
        }
    }

    public void removeTax(int amount) {
            dbData.removeTax(amount);
    }

    public void addtax(int amount, int percentage) {
        dbData.addSlabs(amount,percentage);
    }
}
