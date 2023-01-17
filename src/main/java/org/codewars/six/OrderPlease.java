package org.codewars.six;

public class OrderPlease {
    public static String order(String words) {
        if(words.isEmpty()) return "";
        //split into string[]
        String[] ans = words.split(" ");
        //iterate over that array into a new array
        String[] fina = new String[ans.length];
        for(int i = 0; i < ans.length;i++){
            for(int j = 0; j < ans[i].length();j++){
                if(ans[i].charAt(j) >= 49 && ans[i].charAt(j) <= 57){
                    int pos = Character.getNumericValue(ans[i].charAt(j));
                    fina[pos-1] = ans[i];
                }
            }
        }
        //join
        return String.join(" ",fina);
    }
}
