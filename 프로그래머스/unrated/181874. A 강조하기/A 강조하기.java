class Solution {
    public String solution(String myString) {
        char[] charArray = myString.toCharArray();
        
        for(int i=0; i<charArray.length; i++){
            if(Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        String toString = String.valueOf(charArray);
        String answer = toString.replaceAll("a",
"A");
        return answer;
    }
}