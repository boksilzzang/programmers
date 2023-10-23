import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        char[] charArr = my_string.toCharArray();
        for(int i=0; i<charArr.length; i++){
            if(charArr[i] >= '0' && charArr[i] <= '9'){
                answer.add(charArr[i] - '0');
            }
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}