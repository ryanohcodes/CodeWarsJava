package org.codewars.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {

        ArrayList<String> words = (ArrayList<String>) Arrays.stream(arr).map(x->x.toLowerCase()).collect(Collectors.toList());

        boolean reduction = true;
        ArrayList<String> ans = new ArrayList<>();
        while(reduction){
            for(int i = 0; i < words.size()-1;i++){
                System.out.println(i);
                if(     words.get(i).equals("north") && words.get(i+1).equals("south") ||
                        words.get(i).equals("south") && words.get(i+1).equals("north") ||
                        words.get(i).equals("east")  && words.get(i+1).equals("west") ||
                        words.get(i).equals("west")  && words.get(i+1).equals("east")){
                    i++;
                    continue;
                }else if(i == words.size()-1){
                    System.out.println(100);
                    ans.add(words.get(i));
                    ans.add(words.get(i+1));
                }else ans.add(words.get(i));
            }
            System.out.println(ans);
            reduction = false;
            words.clear();
            words.addAll(ans);
            if(ans.size() > 0){
                reduction = true;
                ans.clear();
            }

        }
        System.out.println(words);
        return words.toArray(new String[words.size()]);
    }
}
