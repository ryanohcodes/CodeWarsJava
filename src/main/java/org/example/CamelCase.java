package org.example;

public class CamelCase {
    static String toCamelCase(String s){
        StringBuilder ans = new StringBuilder();
        boolean cap = false;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90 || s.charAt(i) >= 97 && s.charAt(i) <= 122){
                if(cap){
                    ans.append(Character.toUpperCase(s.charAt(i)));
                    cap = false;
                }
                else ans.append(s.charAt(i));
            }else{
                cap = true;
            }
        }
        return ans.toString();
    }
}
