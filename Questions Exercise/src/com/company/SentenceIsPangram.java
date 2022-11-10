package com.company;

public class SentenceIsPangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        String str1 = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        //System.out.println(IsPangram(str));
        System.out.println(IsPangram(str1));

    }
    static boolean IsPangram(String str) {
        if (str.length() < 26) {
            return false;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            if (!str.contains("" + c)) {
                return false;
            } else {
                return true;
            }

        }
        return true;
    }

}
