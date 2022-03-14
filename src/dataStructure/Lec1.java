package dataStructure;

public class Lec1 {
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }

    public static String found(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return key + "  Found in index " + i;
        }
        return key + "  Not found -_-";
    }

    public static int iteration(int[] array, int key) {
        int counter = 0;
        for (int j : array)
            if (key == j)
                counter++;
        return counter;
    }

    public static int binarySearch(int[] array, int key) {       // in sorted array
        int start = 0, end = (array.length) - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (key == array[mid])
                return mid;

            else if (key < array[mid])
                end = mid - 1;
            else if (key > array[mid])
                start = mid + 1;

        }
        return -1;

    }


    public static void main(String[] args) {

        int[] arrary = {1, 2, 5, 6, 2, 8, 6};
        System.out.println(linearSearch(arrary, 10));
        System.out.println(found(arrary, 6));
        System.out.println(iteration(arrary, 2));
        System.out.println(binarySearch(arrary, 2));


    }
}
