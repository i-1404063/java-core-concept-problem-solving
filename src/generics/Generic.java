package generics;

public class Generic<T> {

    public static <T> Boolean isEqual(Generic<T> g1, Generic<T> g2) {
        return g1.getT().equals(g2.getT());
    }

    private T t;

    public T getT() {
        return this.t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
