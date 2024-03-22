package shoppingcart;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ShoppingCart<E> implements Iterable<E> {

    private final int defaultCapacity = 2;
    private E[] elements;
    private int index;

    public ShoppingCart() {
        this.index = -1;
        this.elements = (E[]) new Object[defaultCapacity];
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity < defaultCapacity) {
            return;
        }

        int extendedCapacity = defaultCapacity * 2;
        elements = Arrays.copyOf(elements, extendedCapacity);
    }

    public void add(E element) {
        ensureCapacity(index + 1);
        elements[++index] = element;
    }

    @Override
    public Iterator<E> iterator() {
        return new ShoppingCartIterator();
    }

    private class ShoppingCartIterator implements Iterator<E> {

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor <= index;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Your shopping cart is empty!. Go for shopping.");
            }

            return elements[cursor++];
        }

    }

}
