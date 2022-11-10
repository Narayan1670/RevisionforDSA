package strings;

import java.util.ArrayList;
import java.util.List;

class PhonePad {
    public static void main(String[] args) {
//        System.out.println(letterCombinations("","123"));
//        System.out.println(letterComb("12"));
        fun();
    }

    public static ArrayList<String> letterComb(String digits) {
        String p = "";
        StringBuilder str = new StringBuilder("");
        if (digits.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<String>();

        int digit  = digits.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch  = (char)('a' + i);
            p = p + ch;
            list.addAll(letterComb(digits.substring(1)));
        }
        return list;
    }



    public static ArrayList<String> letterCombinations(String p,String digits) {

        if (digits.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<String>();

        int digit  = digits.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch  = (char)('a' + i);
            list.addAll(letterCombinations(p+ch,digits.substring(1)));
        }
        return list;
    }
    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit  = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch  = (char)('a' + i);
            pad(p+ch,up.substring(1));
        }
    }
    static void fun() {
        String p = "";
        char ch = (char)('a' + 2);
        p = p + ch;
        System.out.println(p);
    }
}