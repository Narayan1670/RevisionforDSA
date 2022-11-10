package strings;

import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
        System.out.println("subSeq");
        subSeq("", "abcd");
//        System.out.println("subSeqAscii");
//        subSeqAscii("", "abcd");
//        System.out.println("subSets");
//        subSets("abcd", "",0);
//        System.out.println("subSeqRet");
//        System.out.println(subSeqRet("","abc"));
    }

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
//        subSeq(p, up.substring(1));
        subSeq(p + ch, up.substring(1));
    }

    static void subSets(String s, String curr, int i) {
        if(i == s.length()) {
            System.out.println(curr);
            return;
        }
        subSets(s,curr,i + 1);
        subSets(s, curr + s.charAt(i),i + 1);

    }

    static ArrayList<String> subSeqRet(String p, String up) {
        if (up.isEmpty()) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(p);
        return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(p, up.substring(1));
        ArrayList<String> right = subSeqRet(p + ch, up.substring(1));

        left.addAll(right);
        return left;
    }
    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }
}
