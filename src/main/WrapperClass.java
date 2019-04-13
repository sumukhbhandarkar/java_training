package main;

public class WrapperClass {
    public static void main(String []args) {
        int a = 20;
        int b = 30;
        Integer num1 = Integer.valueOf(a);
        Integer num2 = Integer.valueOf(b);
        System.out.println(num1 + num2);
        String s = num1.toString();

        String s1 = "25";
        Integer num3 = Integer.parseInt(s1);

//        Everything in Java is in the form of Object
//        Used to perform opeations on variables. Primitive Data Types are only for passing values and doing arithmetic operations;
//        primitive: WrapperClass;
//
//        int: Integer;
//        float: Float;
//        char: Character;
//        double: Double;
//        long: Long;
//        short: Short;
//        boolean: Boolean;
//        byte: Byte;


    }
}
