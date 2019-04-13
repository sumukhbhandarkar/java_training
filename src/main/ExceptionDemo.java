package main;

import lib.MyException;

import java.util.Scanner;

public class ExceptionDemo {
    static int bankBalance = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String []args) {
//        infinte for loop
        for(;;) {
            try {
                deposit();
            } catch (MyException e) {
                e.printStackTrace();
                withdraw();
            }
        }
    }

    private static void withdraw() {
        bankBalance -= 500;
    }

    static void deposit() throws MyException {
        System.out.println("Enter amount to be deposted : ");
        bankBalance += sc.nextInt();
        if (bankBalance > 500) {
            throw new MyException();
        }
    }
}

//The program initiates bank Balance as 0
//in the inifite for loop, I call the deposit function
//deposit function might throw MyException. That is why I have said "throws MyException on line 26"
//if balance exceeeds 500, exception is thrown. Exception is caught in the main function
//in the catch block, I call another function called withdraw(). The withdraw function reduces the balance by 500.
//Since there is an infinite for loop sequence, the deposit() function is called again, and the check continues till you do Ctrl+C
