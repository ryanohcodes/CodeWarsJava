package org.codewars.six;
import java.util.Arrays;

public class EqualValueSides {
    public static int findEvenIndex(int[] arr) {
        int index = -1;
        for(int i = 0; i < arr.length;i++){
            int[] right = Arrays.copyOfRange(arr, i + 1, arr.length);
            int rightSum = Arrays.stream(right).reduce(0, Integer::sum);
            int[] left = Arrays.copyOfRange(arr, 0, i);
            int leftSum = Arrays.stream(left).reduce(0, Integer::sum);
            if(leftSum == rightSum) return i;
        }
        return index;
    }
}