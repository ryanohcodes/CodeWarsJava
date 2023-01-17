package leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> first = new HashMap<>();
        HashMap<Character,Integer> second = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            Integer current = first.putIfAbsent(s.charAt(i),1);
            if(current == null) continue;
            else{
                first.put(s.charAt(i),first.get(s.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < t.length();i++){
            Integer current =  second.putIfAbsent(t.charAt(i),1);
            if(current == null) continue;
            else{
                second.put(t.charAt(i),second.get(t.charAt(i)) + 1);
            }
        }
        return first.equals(second);
    }
}
