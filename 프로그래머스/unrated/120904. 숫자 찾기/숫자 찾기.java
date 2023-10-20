class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String temp = Integer.toString(num);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++){
            digits[i] = temp.charAt(i) - '0';
        }        
        for(int j = 0; j< digits.length; j++){
            if(digits[j] == k){
                answer = j+1;
                break;
            }
        }
        return answer;
    }
}