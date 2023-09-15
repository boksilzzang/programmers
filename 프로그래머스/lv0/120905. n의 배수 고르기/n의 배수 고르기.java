class Solution {
    public int[] solution(int n, int[] numlist) {
        int length = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                length++;
            }
        }
        int[] answer = new int[length];
        int j = 0;
        for(int k=0; k<numlist.length; k++){
            if(numlist[k]%n == 0) {
                answer[j] = numlist[k];
                j++;
            }   
        }
        return answer;
    }
}