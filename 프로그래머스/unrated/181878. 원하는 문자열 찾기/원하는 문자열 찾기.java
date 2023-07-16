class Solution {
    public int solution(String myString, String pat) {
        String myString1 = myString.toUpperCase();
        String pat1 = pat.toUpperCase();
        if(myString1.contains(pat1)){
            return 1;
        }else {
            return 0;
        }
    }
}