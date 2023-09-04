class Solution {
    public String solution(String myString) {
        char[] temp = myString.toCharArray();
        for(int i=0; i<temp.length; i++){
            if(temp[i]<=107){
                temp[i]='l';
            }
        }
        return String.valueOf(temp);
    }
}