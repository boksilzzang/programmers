class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strSplit = my_string.split(" ");
        boolean add = true;

        for (int i = 0; i < strSplit.length; i++) {
            String number = strSplit[i];
            if (number.equals("+")) {
                add = true;
            } else if (number.equals("-")) {
                add = false;
            } else {
                int num = Integer.parseInt(number);
                if (add) {
                    answer += num;
                } else {
                    answer -= num;
                }
            }
        }
       return answer;
    }
}