package JavaConcepts.Immutable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Input: text1 = "abcde", text2 = "ace" Output: 3
        // Explanation: The longest common subsequence is "ace" and its length is 3.
       //    a  b  c  d  e
       // a  1  1  1  1  1
       // c  1  1  2  2  2
       // e  1  1  2  2  3

        //i=1, j=2
        //

        String s2 = "abc";
        String s1 = "ace";
        int count = commonSequence(s1, s2);
        System.out.println(count);
    }

    public static int commonSequence(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<m; i++){
            dp[i][0] = 1;
        }

        for(int j=0; j<n; j++){
            dp[0][j] = 1;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = 1 + Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1]));
                }else{
                    dp[i][j] = Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1]));
                }
            }
        }
        return dp[m-1][n-1];
    }
}
