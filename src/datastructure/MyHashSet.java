package datastructure;

import java.util.Arrays;

public class MyHashSet {
    private final int defaultCapacity = 1000;
    private int index;
    private int[] tableSet;

    public MyHashSet() {
        this.index = -1;
        this.tableSet = new int[defaultCapacity];
    }

    public void increaseCapacity(int ind) {
        if (ind < defaultCapacity) {
            return;
        }

        int extendedCapacity = defaultCapacity * 2;
        tableSet = Arrays.copyOf(tableSet, extendedCapacity);
    }

    public int searchKey(int[] arr, int low, int high, int key) {

        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }

    public void add(int key) {
        increaseCapacity(index + 1);
        if (searchKey(tableSet, 0, index, key) == -1) {
            tableSet[++index] = key;
        }
    }

    public boolean contains(int key) {
        int ind = searchKey(tableSet, 0, index, key);
        return ind == -1 ? false : true;
    }

    public String remove(int key) {
        int ind = searchKey(tableSet, 0, index, key);
        if (ind == -1) {
            return "already removed";
        } else {
            tableSet[ind] = -1;
            return "Successfully removed";
        }
    }
}
