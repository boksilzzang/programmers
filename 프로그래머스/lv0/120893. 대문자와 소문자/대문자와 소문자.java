class Solution {
    public String solution(String my_string) {
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            }
        }
        String answer = new String(charArray);
        return answer;
    }
}    