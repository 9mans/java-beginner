package array1;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 1, 4, 5};

        Arrays.sort(numbers);

        int index = Arrays.binarySearch(numbers, 4);

        System.out.println(index);
    }
}
