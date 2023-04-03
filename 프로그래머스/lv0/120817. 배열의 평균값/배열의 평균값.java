class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int totalArray = 0;
        
        for(int i=0; i<numbers.length; i++) {
            totalArray += numbers[i];
        }
        answer = (double) totalArray/numbers.length;
        return answer;
    }
}