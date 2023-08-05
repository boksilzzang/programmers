class Solution {
    public int solution(String my_string) {
        char[] chArray = my_string.toCharArray();
        int answer = 0;
        for(int i=0; i<chArray.length; i++){
            if(Character.isDigit(chArray[i])){
                answer += Character.getNumericValue(chArray[i]);
            }
        }
        return answer;
    }
}