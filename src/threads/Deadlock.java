package threads;

public class Deadlock {
    public String lock1 = "imon";
    public String lock2 = "hasan";

    public void startThreads() {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("thread-1");

                synchronized (lock2) {
                    System.out.println("lock acquired");
                }
            }
        }, "thread-1");

        thread1.start();

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("thread-2");

                synchronized (lock1) {
                    System.out.println("lock acquired");
                }
            }
        }, "thread-2");

        thread2.start();
    }
}
