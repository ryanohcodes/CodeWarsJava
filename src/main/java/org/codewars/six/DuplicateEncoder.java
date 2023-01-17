package org.codewars.six;

import java.util.HashMap;
public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        StringBuilder code = new StringBuilder();
        HashMap<Character,Integer> ans = new HashMap<>();
        //loop and add to hashmap
        for(int i = 0; i < word.length();i++){
            if(ans.get(word.charAt(i)) == null){
                ans.put(word.charAt(i),1);
            }else{
                int val = ans.get(word.charAt(i));
                ans.put(word.charAt(i),val+1);
            }
        }
        //if dupe equal to true, replace with )
        for(int i =0; i < word.length();i++){
            if(ans.get(word.charAt(i)) > 1) code.append(')');
            else code.append('(');
        }
        return code.toString();
    }
}

