package org.codewars.six;

import java.util.HashMap;
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        int counter = 0;
        text = text.toLowerCase();
        HashMap<Character,Integer> ans = new HashMap<>();
        for(int i = 0; i < text.length();i++){
            char current = text.charAt(i);
            if(ans.get(current) == null){
                ans.put(current,1);
            }else if(ans.get(current) == 1){
                counter++;
                ans.put(current,ans.get(current)+1);
            }
        }

        return counter;
    }
}
