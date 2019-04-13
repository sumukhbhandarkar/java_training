package main;

public class StaticDemo {

    static int num2 = 30;
    static final int numFinal = 50;
    //    static block is always executed before main class
    static {
        System.out.println("inside static block");
        num2 = 50;
    }

    public static void main(String []args) {
        int num1 = 20;
        System.out.println(num1 + num2);
//        output = 70; (num2 value is declared as 30 and modified in static block. static variables can only be changed in another static reference (either another static  class / method)
//        numFinal = 30; (Cannot be done, because numFinal is static final variable;
        function();
    }

//    static function can only be called from another static reference;
    static void function() {
        System.out.println("Inside static function");
    }
}

//Final output:
//inside static block
//70
//inside static function