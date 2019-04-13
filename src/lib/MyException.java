package lib;

public class MyException extends Exception {
    public MyException() {
        System.out.println("inside myException");
        System.out.println("Bank Balance exceeded 500");
    }
}
