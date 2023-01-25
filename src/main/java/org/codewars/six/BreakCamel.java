package org.codewars.six;

public class BreakCamel {
        public static String camelCase(String input) {
            if(input.isEmpty()) return input;
            StringBuilder answer = new StringBuilder();
            for(int i = 0; i < input.length();i++){
                if(input.charAt(i) <= 90) answer.append(" ");
                answer.append(input.charAt(i));
            }
            return answer.toString();
        }
}
