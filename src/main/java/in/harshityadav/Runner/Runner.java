package in.harshityadav.Runner;


import in.harshityadav.Runner.util.Calculator;

public class Runner {

    public static void main(String[] args){

        System.out.println("Hello From Runner");
        Calculator c= new Calculator();
        int result=c.add(2,3);
        // if we want to pass float value
        int moreresult= c.addDouble(1.1,1.2);
        System.out.println(result);
        System.out.println(moreresult);

    }

}
