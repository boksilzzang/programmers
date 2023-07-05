class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int last = num_list.length-1;
        int newone = 0;
        
        if(num_list[last]>num_list[last-1]){
            newone = num_list[last]-num_list[last-1];
        }else {
            newone = num_list[last] * 2;
        }
        
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];            
        }
            answer[num_list.length] = newone;
        return answer;
    }
}