package main;

public class MultithreadDeadlock {
    public static void main(String[] args) {
        Shared s1 = new Shared();
        Shared s2 = new Shared();

        ChildT1 t1 = new ChildT1(s1, s2);
        t1.start();

        ChildT2 t2 = new ChildT2(s1, s2);
        t2.start();

//        putting main thread to sleep
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ChildT1 extends Thread {
    Shared s1, s2;
    public ChildT1(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    public void run() {
        s1.test1(s2);
    }

}

class ChildT2 extends Thread {
    Shared s1, s2;
    public ChildT2(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    public void run() {
        s2.test2(s1);
    }

}

class Shared {

    synchronized void test1(Shared s2) {
        System.out.println("test 1 begin");
//        putting thread to sleep
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s2.test2(this);
        System.out.println("test 1 ends");
    }

    synchronized void test2 (Shared s1) {
        System.out.println("test 2 begin");
//        putting thread to sleep
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s1.test1(this);
        System.out.println("test 2 ends");
    }

}

//
//        Thread t1 starts and calls test1 method by taking the object lock of s1.
//        Thread t2 starts and calls test2 method by taking the object lock of s2.
//        t1 prints test1-begin and t2 prints test-2 begin and both waits for 1 second, so that both threads can be started if any of them is not.
//        t1 tries to take object lock of s2 and call method test2 but as it is already acquired by t2 so it waits till it become free. It will not release lock of s1 until it gets lock of s2.
//        Same happens with t2. It tries to take object lock of s1 and call method test1 but it is already acquired by t1, so it has to wait till t1 release the lock. t2 will also not release lock of s2 until it gets lock of s1.
//        Now, both threads are in wait state, waiting for each other to release locks. Now there is a race around condition that who will release the lock first.
//        As none of them is ready to release lock, so this is the Dead Lock condition.
//        When you will run this program, it will be look like execution is paused.