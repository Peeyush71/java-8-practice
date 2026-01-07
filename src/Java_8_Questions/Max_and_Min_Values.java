package Java_8_Questions;


// Find the maximum and minimum values present in a list using

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Max_and_Min_Values {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(15,25,45,85,74,15,25);
        Optional<Integer> max =arr.stream().max(Integer::compareTo);
        Optional<Integer> min = arr.stream().min(Integer::compareTo);

        System.out.println(max.orElse(null));
        System.out.println(min.orElse(null));
    }
}
