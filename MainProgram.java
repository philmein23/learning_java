import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);

    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    public static int smallest(int[] numbers) {
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest_index = 0;
        int smallest = array[0];
        int index = 0;

        for (int val : array) {
            if (val < smallest) {
                smallest = val;
                smallest_index = index;
            }
            index++;
        }
        return smallest_index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        int smallest_index = startIndex;

        for (int i = startIndex; i <= table.length - 1; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallest_index = index;
            }
            index++;
        }

        return smallest_index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int firstVal = array[index1];
        int secondVal = array[index2];

        array[index1] = secondVal;
        array[index2] = firstVal;

    }

    // public static void sort(int[] array) {
    // int smallest_index = 0;
    // for (int i = 0; i < array.length - 1; i++) {
    // smallest_index = indexOfSmallestFrom(array, i);
    // swap(array, i, smallest_index);
    // System.out.println(Arrays.toString(array));
    // }
    // }
}