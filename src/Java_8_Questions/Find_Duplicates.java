package Java_8_Questions;

// Identify duplicate elements in a given integer list using Stream

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Duplicates {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(15,25,45,85,74,15,25);
        Set<Integer> temp = new HashSet<>();
        arr.stream().filter(num -> !temp.add(num)).forEach(System.out::println);
    }
}
