class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String total = Integer.toString(a)+Integer.toString(b);
        int total2 = Integer.parseInt(total);
        if(total2 == 2*a*b) {
            answer = total2;
        }else if(total2 < 2*a*b) {
            answer = 2*a*b;
        }else {
            answer = total2;
        }
        return answer;
    }
}