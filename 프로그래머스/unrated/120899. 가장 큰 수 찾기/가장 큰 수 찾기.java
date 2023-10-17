import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] arraySort = Arrays.copyOf(array,array.length);
        Arrays.sort(arraySort);
        answer[0] = arraySort[arraySort.length-1];
        for(int i=0; i<array.length; i++){
            if(arraySort[arraySort.length-1] == array[i]){
                answer[1] = i;
            }
        }
        return answer;
    }
}