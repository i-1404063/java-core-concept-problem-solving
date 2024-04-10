package datastructure;

import java.util.*;

public class HashMapImplementation {

    static class HashMap<K, V> {

        private int n; // nodes
        private int N; // bucket size

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> bucket = oldBucket[i];
                for (int j = 0; j < bucket.size(); j++) {
                    this.put(bucket.get(j).key, bucket.get(j).value);
                }
            }
        }

        private int generateBucketIndexHash(K key) {
            int hash = key.hashCode();
            return Math.abs(hash) % N;
        }

        private int isKeyExist(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }

            return -1;
        }

        void put(K key, V value) {
            int bucketIndex = generateBucketIndexHash(key);
            int isExist = isKeyExist(key, bucketIndex);

            if (isExist == -1) {
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            } else {
                Node _node = buckets[bucketIndex].get(isExist);
                _node.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        boolean keyContains(K key) {
            int bi = generateBucketIndexHash(key);
            int isExist = isKeyExist(key, bi);

            if (isExist == -1) {
                return false;
            }

            return true;
        }
    }

    public static void main(String... args) {
        HashMapImplementation.HashMap<String, Integer> obj = new HashMapImplementation.HashMap<>();

        obj.put("Bangladesh", 20);
        System.out.println(obj.keyContains("Bangladesh"));
    }
}
