class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for(int k=0; k<finished.length; k++){
            if(finished[k] == false){
                length++;
            }
        }
        String[] answer = new String[length];
        int index = 0;
        for(int i=0; i<todo_list.length; i++){
            if(finished[i] == false){
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}