package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbData {
    private static DbData dbData;

/*    List<List<Integer>> taxSlabs=new ArrayList<>();*/
    List<int[]> taxSlabs=new ArrayList<>();

    public  DbData getInstance()
    {
        if(dbData==null)
        {
            dbData=new DbData();
        }
        return dbData;
    }


    public  String password="12345";

    public  String getPassword()
    {
        return password;
    }
    public void addSlabs(int amount,int percentage)
    {
            taxSlabs.add(new int[]{amount,percentage});
    }
    public List<int[]> getSlabs() {
        return taxSlabs;
    }
    public void removeTax(int amount)
    {
        for(int[] arr:taxSlabs)
        {
            if(arr[0]==amount)
            {
                int ind=taxSlabs.indexOf(arr);
                taxSlabs.remove(ind);
                break;
            }
        }
    }
}

