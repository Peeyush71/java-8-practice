package Java_8_Questions;

import java.util.Arrays;
import java.util.List;

public class Remove_Duplicates {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,1,3,2,5,8);

        arr.stream().distinct().forEach(System.out::println);
    }
}
