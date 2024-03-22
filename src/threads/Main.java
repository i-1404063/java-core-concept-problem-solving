package threads;

public class Main {
    public static void main(String[] args) {
        // multi-threading environment
        Stack stack = new Stack(5);

        new Thread(() -> {
            int count = 0;
            while (++count < 10) {
                System.out.println("Pushed: " + stack.push(100));
            }
        }, "pusher").start();

        new Thread(() -> {
            int count = 0;
            while (++count < 10) {
                System.out.println("Popper: " + stack.pop());
            }
        }).start();

        // deadlock-situation
        new Deadlock().startThreads();

    }
}
