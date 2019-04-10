package main;

class Cat {
    void print() {
        System.out.println("Inside Cat Class");
    }
}

class Dog extends Cat {
    void print() {
        System.out.println("Inside Dog Classs");
    }
}


public class Animal {
    public static void main(String []args) {
        Cat c = new Cat();
        Cat d = new Dog();

//        Create object of Dog which has reference to Cat
//        Possible If and Only If Dog extends Cat

        c.print();
        d.print();

//        Output:
//        Inside Cat Class
//        Inside Dog Class

//        print() function from Cat class overrides print() function from Dog class
    }
}
