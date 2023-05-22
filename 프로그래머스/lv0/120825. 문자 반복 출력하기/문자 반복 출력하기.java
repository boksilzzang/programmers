class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            for(int k=1; k<=n; k++){
            answer += my_string.charAt(i);
            }
        } 
        return answer;
    }
}