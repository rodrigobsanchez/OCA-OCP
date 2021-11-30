package OCA.Chapter3.Arrays;

import java.util.Arrays;

public class ArraysSortingAndSearching {

    public static void main(String[] args) {
        int[] numbers = { 6, 9, 1, 5, 28, 21 };
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for(int i = 0; i < strings.length; i++){
            System.out.print(strings[i] + " ");
        }


        System.out.println();

        int[] numbers2 = {2,4,6,8};
        // Searching Arrays.binarySearch will return index if exists and
        System.out.println(Arrays.binarySearch(numbers2, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers2, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers2, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers2, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers2, 9)); // -5

    }
}
