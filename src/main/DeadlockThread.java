package main;

public class DeadlockThread {
    public static void main(String[] args) {
        try {
            System.out.println("Entering deadlock");
            Thread.currentThread().join();
            System.out.println("This statement will never exec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//Deadlock of main thread, using single thread;
//join() method in Thread class: allows one thread to complete before starting the next thread
//The new thread will wait till complete execution of previous thread
//
//in this case, the main thread is waiting for completion of main thread.
//Now this is not possible, thus leading to deadlock state
