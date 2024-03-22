package threads;

import java.lang.Thread;

public class Thread1 extends Thread {

    public Thread1(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("inside " + Thread.currentThread().getName() + " " + i);
        }
    }

}
