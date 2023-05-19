class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        int answer1 = 1;
        int answer2 = 0;
        for(int i=0; i<num_list.length; i++){
            answer1 *= num_list[i];
        }
        for(int i=0; i<num_list.length; i++){
            answer2 += num_list[i];
            result = answer2 * answer2;
        }
        return answer1 > result ? 0 : 1;
    }
}