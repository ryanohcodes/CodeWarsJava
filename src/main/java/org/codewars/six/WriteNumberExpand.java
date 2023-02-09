package org.codewars.six;

public class WriteNumberExpand {
    public static String expandedForm(int num){
        StringBuilder ans = new StringBuilder();
        int track = 0;
        String number = Integer.toString(num);
        for(int i = 0; i < number.length();i++){
            int counter = number.length()-i-1;
            String current = Character.toString(number.charAt(i));

            if(current.equals("0")) continue;
            int start = 0;
            while(start < counter){
                current += "0";
                start++;
            }
            track += Integer.parseInt(current);
            ans.append(current);
            System.out.println(track);
            if(i < number.length()-1 && track < num){
                ans.append(" + ");
            }
        }
        return ans.toString();
    }
}
