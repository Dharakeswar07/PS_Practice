package login;

import db.DbData;
import taxSlabs.TaxSlabsView;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.List;
public class LoginModule {
private static DbData dbData=new DbData().getInstance();

    public void checkPass(String pass) {
        if(pass.equals(dbData.getPassword()))
        {
            TaxSlabsView.showMenu();
        }
        else
        {
            new LoginView().showMessage("Enter the Correct Password");
        }
    }

    public int calIncome(int income) {
        List<int[]> lst=dbData.getSlabs();
        int count=0;
        int tax=0;
        while(income>0)
        {
            long limit=0;
            int[] arr=lst.get(count);
             if(count!=0 && count<lst.size()-1)
            {
                int[] arr1=lst.get(count-1);
                limit=arr[0]-arr1[0];
            }
            else {
                limit=arr[0];
            }

            if(income>=limit)
            {
                tax+=(int)(limit * arr[1])/100;
            }
            else
            {
                tax+=(int)(income * arr[1])/100;
            }
                income-=limit;

            count++;
        }
        return tax;
    }

    public void defaultAdd() {
        dbData.addSlabs(10000,10);
        dbData.addSlabs(50000,20);
        dbData.addSlabs(100000,30);
        dbData.addSlabs(500000,40);
        dbData.addSlabs(500001,50);
    }
}
