class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderstr = Integer.toString(order);
        for(int i=0; i<orderstr.length(); i++){
            if(orderstr.charAt(i) == '3' || orderstr.charAt(i) == '6' || orderstr.charAt(i) == '9'){
                answer++;
            }
        }
        return answer;
    }
}