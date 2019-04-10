package main;

import lib.Compute;

public class ThisKeyword {
//    this keyword has two uses:
//    1. Referring to context variable (variable that belongs to given class)
//    2. Implementation of constructor chaining.
    static int classVariable;
//    classVariable is declared as static because main is a static function and static function can only use static variables.
    public static void main(String[] args) {
        Compute compute = new Compute(classVariable);
    }
}
