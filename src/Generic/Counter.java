package Generic;

public class Counter<T extends Number> {

    T t;

    Counter(T t) {
        this.t = t;
    }

    public void printCount() {
        System.out.println(t);
    }
}
