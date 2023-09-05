class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a)+String.valueOf(b);
        String ba = String.valueOf(b)+String.valueOf(a);
        if(Integer.valueOf(ab) >= Integer.valueOf(ba)) {
            return Integer.valueOf(ab);
        }else {
            return Integer.valueOf(ba);
        }
    }
}