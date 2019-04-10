package main;

import lib.Compute;

import java.util.Scanner;

public class Calculator {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of numerical array : ");
        int size = scanner.nextInt();
        int numArray[] = new int[size];
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i< size; i++) {
            numArray[i] = scanner.nextInt();
        }
        Compute compute = new Compute(numArray);
//        Compute is constructor in lib.Compute class.
    }
}
