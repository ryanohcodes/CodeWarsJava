package org.codewars.six;

public class StringSplit {
    public static String[] solution(String s) {
        int len = s.length() % 2 == 0 ? s.length()/2 : (int) Math.floor(s.length()/2 +1);
        String[] ans = new String[len];
        String temp = "";
        int counter = 0;
        for(int i = 0; i < s.length();i++){
            temp += s.charAt(i);
            if(temp.length() % 2 == 0){
                ans[counter] = temp;
                counter++;
                temp = "";
            }
        }
        if(temp.length() % 2 == 1){
            temp += "_";
            ans[counter] = temp;
        }
        return ans;
    }
}
