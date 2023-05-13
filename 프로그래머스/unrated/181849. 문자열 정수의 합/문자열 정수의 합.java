class Solution {
    public int solution(String num_str) {
        int[] num_strArr = new int[num_str.length()];
        for(int i = 0; i<num_str.length(); i++) {
            int tmp = Integer.parseInt(num_str.substring(i, i+1));
            num_strArr[i] = tmp;
        }
        int answer = 0;
        for(int j = 0; j<num_strArr.length; j++){
            answer += num_strArr[j];
        }
        return answer;
    }
}