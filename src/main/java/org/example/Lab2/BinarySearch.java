package org.example.Lab2;

public class BinarySearch {
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int low = 0;
        int high = array.length - 1;
        // The comparison must be less strict (<=) to
        // ensure both the pointers meet on the right element.
        // Strict comparison fails when choosing the
        // 1st and last element.
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
