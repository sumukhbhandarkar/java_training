package lib;

public class Compute {
//    Constructor called in Calculator.java in main package
    public Compute(int numArray[]) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println(sum);
    }
}
