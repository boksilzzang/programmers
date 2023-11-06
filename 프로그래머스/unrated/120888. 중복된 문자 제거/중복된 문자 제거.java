class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (answer.indexOf(String.valueOf(currentChar)) == -1) {
                answer.append(currentChar);
            }
        }
        return answer.toString();
    }
}