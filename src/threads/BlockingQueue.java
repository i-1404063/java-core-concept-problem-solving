package threads;

// Producer and consumer pattern problem 
// where multiple threads try to access the same object method and queued theirself into 
// an waiting state as long as another thread make shared resource in consistent state
import java.util.*;

public class BlockingQueue {
    private Queue<Integer> queue;
    private int capacity;

    private BlockingQueue(int capacity) {
        this.queue = new LinkedList<Integer>();
        this.capacity = capacity;
    }

    public boolean add(int element) {
        synchronized (queue) {
            while (queue.size() == capacity) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            queue.add(element);
            queue.notifyAll();
            return true;
        }
    }

    public int remove() {
        synchronized (queue) {
            while (queue.size() == 0) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            int el = queue.poll();
            queue.notifyAll();
            return el;
        }
    }
}
