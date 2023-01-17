package org.codewars.six;

import java.util.Arrays;
public class FindOutlier{
    static int find(int[] integers){
        int[] oddArray = Arrays.stream(integers).filter(x -> Math.abs(x) % 2 == 1).toArray();
        int[] evenArray = Arrays.stream(integers).filter(x -> x % 2 == 0).toArray();
        int ans;
        if(oddArray.length > evenArray.length){
            ans = evenArray[0];
        }else{
            ans = oddArray[0];
        }
        return ans;
    }
}
