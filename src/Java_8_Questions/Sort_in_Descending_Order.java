package Java_8_Questions;

// Sort a list of integers in descending order using stream


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_in_Descending_Order {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,2,5,7,4,6);

        arr.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
