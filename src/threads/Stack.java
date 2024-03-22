package threads;

public class Stack {
    private int[] stack;
    private int stackTop;

    public Stack(int capacity) {
        this.stack = new int[capacity];
        this.stackTop = -1;
    }

    public synchronized boolean push(int element) {

        if (isFull())
            return false;
        ++stackTop;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        stack[stackTop] = element;
        return true;

    }

    public synchronized int pop() {

        if (isEmpty())
            return Integer.MIN_VALUE;
        int obj = stack[stackTop];
        stack[stackTop] = Integer.MIN_VALUE;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        stackTop--;
        return obj;

    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= stack.length - 1;
    }

}
