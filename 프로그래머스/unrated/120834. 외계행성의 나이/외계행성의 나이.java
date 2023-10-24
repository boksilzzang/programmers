class Solution {
    public String solution(int age) {
       String digits = "";
        while (age > 0) {
            int digit = age % 10;
            digits = digit + digits;
            age /= 10;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
            char letter = (char) ('a' + digit);
            result.append(letter);
        }
        
        return result.toString();
    }
}