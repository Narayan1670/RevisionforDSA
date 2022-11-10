package MCM;

import java.util.ArrayList;
import java.util.List;

public class PailnromePartitioning {
//    https://leetcode.com/problems/palindrome-partitioning/


    //1st Solution
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> part = new ArrayList<String>();
        solution(0, s, part, res);
        return res;
    }

    private static void solution(int index, String s, List<String> part, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(part));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index , i)) {
                part.add(s.substring(index, i+1));
                solution(i+1,s,part,res);
                part.remove(part.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }




//    all palindrome partitions of a string
// basic recusion to print all palindromes froma string
    public static void solve(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String prefix = str.substring(0,i+1);
            String ros = str.substring(i+1);
            if (isPlaindrome(prefix)) {
                solve(ros, asf + "(" + prefix + ")");
            }
        }
    }

    private static boolean isPlaindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while(l < r) {
            char left = str.charAt(l);
            char right = str.charAt(r);
            if (left != right) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

//    https://leetcode.com/problems/palindrome-partitioning-ii/

    //1st approach
    public static int minCut(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int g = 0; g < s.length(); g++) {
            for(int i = 0, j = g; j < dp.length;i++,j++) {
                if(g == 0) {
                    dp[i][j] = true;
                } else if(g == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
            }
        }
        int[] strg = new int[s.length()];
        strg[0] = 0;

        for (int j = 1; j < strg.length; j++) {
            if(dp[0][j]) {
                strg[j] = 0;
            } else {
                int min = Integer.MAX_VALUE;
                for (int i = j; i >= 1 ; i--) {
                    if(dp[i][j]) {
                        if(strg[i-1] < min) {
                            min = strg[i-1];
                        }
                    }
                }
                strg[j] = min + 1;
            }
        }
        return strg[strg.length - 1];
    }

    public static void main(String[] args) {
        String str = "ab";
//        System.out.println(partition(str));
//        [[a, a, b], [a, a, b, aa, b]]
//        solve(str, "");
        System.out.println(minCut(str));
    }

}
