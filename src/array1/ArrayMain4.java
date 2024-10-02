package array1;

import java.util.Arrays;

public class ArrayMain4 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] newNumbers = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(newNumbers));

        int[] newNumbers1 = Arrays.copyOfRange(newNumbers, 0, 3);
        System.out.println(Arrays.toString(newNumbers1));


    }
}
