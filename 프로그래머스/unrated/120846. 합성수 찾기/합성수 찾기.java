import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int yaksuCount = 0;
            for(int k=1; k<=i; k++){
                if(i % k == 0){
                    yaksuCount++;
                    if(yaksuCount > 2){
                        break;
                    }
                }
            }
            if(yaksuCount > 2){
                answer++;
            }
        }
        return answer;
    }
}