class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i=0;
        
        do {
            if (i < numbers.length) {
                answer += numbers[i];
                i++;
            } else {
                break;
            }
        } while( answer <= n );
        
        return answer;
    }
}