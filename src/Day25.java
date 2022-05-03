import java.util.*;
public class Day25 {
        public static boolean isMatch(String text, String pattern) {
            boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
            dp[text.length()][pattern.length()] = true;

            for (int i = text.length(); i >= 0; i--){
                for (int j = pattern.length() - 1; j >= 0; j--){
                    boolean first_match = (i < text.length() &&
                            (pattern.charAt(j) == text.charAt(i) ||
                                    pattern.charAt(j) == '.'));
                    if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                        dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                    } else {
                        dp[i][j] = first_match && dp[i+1][j+1];
                    }
                }
            }
            return dp[0][0];
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            String p = in.nextLine();
            System.out.println(isMatch(s,p));
        }
}
