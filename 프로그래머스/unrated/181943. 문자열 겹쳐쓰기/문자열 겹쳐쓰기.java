class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        if (s < 0 || s >= my_string.length()) {
            return my_string;
        }

        StringBuilder result = new StringBuilder(my_string.substring(0, s));
        result.append(overwrite_string);

        if (s + overwrite_string.length() < my_string.length()) {
            result.append(my_string.substring(s + overwrite_string.length()));
        }

        return result.toString();
    }
}