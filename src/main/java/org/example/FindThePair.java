package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindThePair {

    public static void findThePairForAGivenSum(Integer[] arrayOfNumbers, int targetNumber) {
        //method will take an array of numbers as well as int value
        //loop through the array, and for each item in the array, do a subtraction of the item from
        //the target number.
        //keep a track of the item in a pair and the
        int setinelValue = -1;
        String result = "";
        Map<Integer, Integer> matchingPair = new HashMap<>();

        for (int i = 0; i <= arrayOfNumbers.length - 1; i++) {
            int pair = targetNumber - arrayOfNumbers[i];
            if (matchingPair.containsValue(pair)) {
                System.out.printf("Pair found (%d, %d)%n", arrayOfNumbers[i], pair);
                setinelValue = 0;
            }

            matchingPair.put(i, arrayOfNumbers[i]);
            result = "Pair not found";
        }

        if (setinelValue == -1){
            System.out.println(result);
        }
    }

    public static String findThePairForAGivenSumToReturnString(Integer[] arrayOfNumbers, int targetNumber) {
        List<String> resultPairs = new ArrayList<>();
        Map<Integer, Integer> matchingPair = new HashMap<>();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int pair = targetNumber - arrayOfNumbers[i];
            if (matchingPair.containsValue(pair)) {
                resultPairs.add(String.format("Pair found (%d, %d)", arrayOfNumbers[i], pair));
            }

            matchingPair.put(i, arrayOfNumbers[i]);
        }
        return resultPairs.isEmpty() ? "Pair not found" : resultPairs.toString();
    }

    public static void main(String[] args) {
        Integer[] arrayOfNumbers = {8, 7, 2, 5, 3, 1};
//        FindThePair.findThePairForAGivenSum(arrayOfNumbers, 10);
        System.out.println(FindThePair.findThePairForAGivenSumToReturnString(arrayOfNumbers, 10));
    }

}
