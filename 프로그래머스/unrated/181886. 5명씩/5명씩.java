import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<String>();
        for(int i=0; i<names.length; i+=5){
            answer.add(names[i]);
        } 
        return answer.toArray(new String[answer.size()]);
    }
}