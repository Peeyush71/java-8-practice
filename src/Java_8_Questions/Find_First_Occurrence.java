package Java_8_Questions;

//Given a list of integers, find the first element using the stream function:

import java.util.Arrays;
import java.util.List;

public class Find_First_Occurrence {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,20,25,45,55,60);
        arr.stream().findFirst().ifPresent(System.out::println);

    }
}
