import datastructure.MyHashSet;

public class Main {

    public static void main(String... args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(4);
        System.out.println(hashSet.contains(4));
        System.out.println(hashSet.remove(4));
        System.out.println(hashSet.contains(4));
        hashSet.add(0);
    }
}
