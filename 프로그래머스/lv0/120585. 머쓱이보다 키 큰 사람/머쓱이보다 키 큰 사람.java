class Solution {
    public int solution(int[] array, int height) {
        //머쓱이보다 키 큰 사람 수 return
        int tot=0; //총 키가 큰 사람 수를 받을 변수 
        for(int i=0; i< array.length; i++) {
            if(array[i]>height) {
                tot++;
            }
        }
        return tot;
    }
}