package Java_8_Questions;


// Find the square of all integers in a list and print only those values that are greater than 50

import java.util.Arrays;
import java.util.List;

public class Square_and_Filter {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,4,8,3,2,6);

        arr.stream().map(n -> n*n).filter(n -> n>50).forEach(System.out::println);
    }
}
