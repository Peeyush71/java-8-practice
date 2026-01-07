package Java_8_Questions;

// Sort all values in a stream in ascending order using

import java.util.Arrays;
import java.util.List;

public class Sort_in_Ascending_Order {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,5,4,8,6,2);

        arr.stream().sorted().forEach(System.out::println);

    }
}
