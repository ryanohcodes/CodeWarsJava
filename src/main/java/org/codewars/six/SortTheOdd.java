package org.codewars.six;

import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int[] answer= new int[array.length];
        int[] oddNum = Arrays.stream(array).filter(x -> x%2 == 1).sorted().toArray();

        int counter = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i] % 2 == 0) answer[i] = array[i];
            else{
                answer[i] = oddNum[counter];
                counter++;
            }
        }
        return answer;
    }
}
