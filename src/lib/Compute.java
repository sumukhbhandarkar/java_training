package lib;

public class Compute {
    int classVariable;
//    Constructor called in Calculator.java in main package
    public Compute(int numArray[]) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println(sum);
    }

//    Constructor called in ThisKeyword.java from main package
    public Compute(int classVariable) {
//        First line of constructor can call another constructor
//        String.valueOf() is a function from String class which converts contents to String type.
//        next line calls the third constructor which accepts String as parameter
        this(String.valueOf(classVariable));
        this.classVariable = classVariable;
        System.out.println(classVariable);
    }

    public Compute(String params) {
        System.out.println("Constructor Chaining: " + params);
    }
}
