package org.example;

import java.util.Arrays;

public class FindTheKthSmallestElement {
    public static String kthSmallestElement(Integer[] arrayOfNumbers, int kthValue) {
        //sort the array
        //determine the number at the position
        //constraints are k must be a valid value

        if (kthValue > 0 && kthValue < arrayOfNumbers.length) {
            Arrays.sort(arrayOfNumbers);
            return String.format("k'th smallest array element is %d", arrayOfNumbers[kthValue - 1]);
        } else {
            return String.format("k'th value is invalid");
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {7, 4, 6, 3, 9, 1};

        System.out.println(kthSmallestElement(numbers, 3));
    }
}

