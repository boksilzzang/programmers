class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1 && i>=idx){
                answer = i;
                break;
            }else {
                answer = -1;
            }
        }
        return answer;
    }
}