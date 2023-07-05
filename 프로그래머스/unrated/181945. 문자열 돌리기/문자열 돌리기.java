import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String[] aToArray = a.split("");
        
        for(int i=0; i<aToArray.length; i++) {
            System.out.println(aToArray[i]);
        }
    }
}