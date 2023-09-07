class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        for(int i=0; i< myString.length(); i++){
            if("A".equals(myString.substring(i,i+1))){
                str += "B";
            }else {
                str += "A";
            }
        }
        if(str.contains(pat)){
            return 1;
        }else {
            return 0;
        }
    }
}