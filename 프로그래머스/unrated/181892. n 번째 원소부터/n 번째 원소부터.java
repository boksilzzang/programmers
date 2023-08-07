class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = Math.abs(n-num_list.length)+1;
        int[] answer = new int[length];
        int index = n-1;
        for(int i=0; i<answer.length; i++){
            int numList = num_list[index];
            answer[i] = numList;
            index++;
        }
        return answer;
    }
}