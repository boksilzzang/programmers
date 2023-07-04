import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
   StringBuilder convertedStr = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                convertedStr.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                convertedStr.append(Character.toUpperCase(c));
            } else {
                convertedStr.append(c);
            }
        }
        
        System.out.println(convertedStr.toString());
    }
}