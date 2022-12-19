package in.harshityadav.Runner.util;

import in.harshityadav.internal.AddHelper;

public class Calculator {

    AddHelperOld helper=new AddHelperOld();
    public int add(int i,int j)
    {
        return helper.add(2,3);
    }
    public int addDouble(double i,double j)
    {
        return helper.add((int)i,(int)j);
    }
}
