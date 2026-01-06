package Java_8_Questions;

// Find all even and odd numbers existing in a list using stream function:

import java.util.Arrays;
import java.util.List;

public class Even_and_Odd_Numbers {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 20, 25, 45, 55, 60);

        arr.stream().
                filter( n-> n%2==0)
                .forEach(n -> System.out.println("Even : " + n));

        arr.stream().filter(n -> n%2 != 0)
                .forEach(n -> System.out.println("Odd : " + n));


//        arr.forEach(n -> System.out.println( n + " is " + (n% 2 ==0 ? "Even " : "Odd ")));


    }
}
