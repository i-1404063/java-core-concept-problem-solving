package threads;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 4; i < 8; i++) {
            System.out.println("inside " + Thread.currentThread() + " " + i);
        }
    }
}
