class Solution {
    public int solution(String binomial) {
        int answer1 = 0;
        int answer2 = 0;
        int total = 0;
        String binomialTrim = binomial.replaceAll("\\s", "");
        String[] str = {};
        for(int i=0; i<binomialTrim.length(); i++){
            if(binomialTrim.charAt(i)=='+' || binomialTrim.charAt(i)=='-' || binomialTrim.charAt(i) == '*') {
                str = binomial.split(String.valueOf(binomial.charAt(i)));
            }
        }
        answer1 = Integer.valueOf(str[0]);
        answer2 = Integer.valueOf(str[2]);
        if(str[1].equals("+")){
            total = answer1 + answer2;
        }else if(str[1].equals("-")){
            total = answer1 - answer2;
        }else {
            total = answer1 * answer2;
        }
        return total;
    }
}