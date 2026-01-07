package Java_8_Questions;

// Determine if an array contains any duplicate values by comparing the count of distinct elements to the original length.

import java.util.Arrays;


public class Check_for_Duplicates_in_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,5,4,8,9,6,8,7};

        if(Arrays.stream(arr).distinct().count() !=arr.length){
            System.out.println("It contains duplicate value");
        }else{
            System.out.println("It doesn't contains duplicate value");
        }
    }
}
