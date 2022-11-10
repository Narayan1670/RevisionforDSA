package backtracking;

import java.util.ArrayList;
import java.util.List;


public class GenerateParanThesis {
    public static void main(String[] args) {

        System.out.println(generateParenthesis(3));

    }
    public static List<String> generateParenthesis(int n) {
        String res = "";
        int open = 0, close = 0;
        List<String> result = new ArrayList<>();
        backtrack(result,res,open,close, n);
        return result;
    }

    private static void backtrack(List<String> result, String res, int open, int close, int maxCount) {
        if(open == maxCount && close == maxCount) {
            result.add(res);
            return;
        }
        if(open < maxCount) {
            backtrack(result,res + "(",open+ 1,close,maxCount);
        }
        if (close < open) {
            backtrack(result,res + ")",open,close+1,maxCount);
        }
    }


}







