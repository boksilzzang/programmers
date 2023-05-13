class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int total = 1;
        if(num_list.length<=10) {
            for(int i=0; i<num_list.length; i++){
                total *= num_list[i];
                answer = total;
            }
        }else if(num_list.length>=11){
            for(int i=0; i<num_list.length; i++){
                answer += num_list[i];
            }
        }
        return answer;
    }
}