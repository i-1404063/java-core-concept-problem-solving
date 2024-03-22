import java.lang.FunctionalInterface;

@FunctionalInterface
public interface GenericInterface<T> {

    T getReverseString(T t);
}
