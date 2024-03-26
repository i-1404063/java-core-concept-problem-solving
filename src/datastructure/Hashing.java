package datastructure;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String... args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(6);
        set.add(7);

        if (set.contains(7)) {
            System.out.println("set contains 7");
        }

        for (int num : set) {
            System.out.println(num);
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            int d = (int) it.next();
            if (d == 7) {
                it.remove();
            }
        }

        System.out.println(set);

    }

}
