package Java_8_Questions;

//Find all numbers in a list that start with the digit 5


import java.util.Arrays;
import java.util.List;

public class Numbers_Starting_With_5 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,50,54,75,84,5,15);

        arr.stream().filter(n -> n.toString().startsWith("5")).forEach(System.out::println);
    }
}
