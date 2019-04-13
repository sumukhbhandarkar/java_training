package main;

public class ThreadDemo extends Thread {
    public static void main(String []args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
//        output: main
        thread.setPriority(MIN_PRIORITY);
        for (int i = 0; i< 5; i++) {
            System.out.println("inside main thread: " + i);
        }
        ChildThread1 childThread = new ChildThread1();
        ChildThread2 ct2 = new ChildThread2();
        childThread.setPriority(MAX_PRIORITY);
        ct2.setPriority(5);
        ct2.start();
        childThread.start();

    }
}

class ChildThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("inside child thread1: " + i);
        }
    }
}

class ChildThread2 extends Thread {
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("inside child thread2: " + i);
        }
    }
}

//Clearly multithreading is not possible using the Thread class
//The threads are being called one after the other, irrespective of the priority set
