package Java_8_Questions;

// Count Total Elements: Find the total number of elements present in a list using the stream function :

import java.util.Arrays;
import java.util.List;

public class Count_Total_Elements {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 20, 25, 45, 55, 60);
        System.out.println(arr.stream().count());
    }

}
