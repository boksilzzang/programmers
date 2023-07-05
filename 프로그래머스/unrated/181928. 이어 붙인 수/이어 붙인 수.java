class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddStringBuilder = new StringBuilder();
        StringBuilder evenStringBuilder = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStringBuilder.append(num);
            } else {
                oddStringBuilder.append(num);
            }
        }

        int oddSum = 0;
        int evenSum = 0;

        if (oddStringBuilder.length() > 0) {
            oddSum = Integer.parseInt(oddStringBuilder.toString());
        }

        if (evenStringBuilder.length() > 0) {
            evenSum = Integer.parseInt(evenStringBuilder.toString());
        }

        return oddSum + evenSum;
    }
}
