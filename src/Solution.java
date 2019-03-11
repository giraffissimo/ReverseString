/**
 * Created by giraffissimo
 * Date: 11.03.2019
 *
 * Given an input string, reverse the string word by word.
 */

public class Solution {


    // Solution #1
    public static String reverseWords(String s) {
        String result = "";
        String[] strArray = s.split("\\s");
        for(int i = strArray.length - 1; i >= 0; i--) {
            if(!strArray[i].isBlank()) {
                result += strArray[i] + " ";
            }
        }
        return result.stripTrailing();
    }

    // Solution #2 for reversing letters int the word
    public static String reverseWordsStringBuilder(String s) {
        if(s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "the sky is   blue";
        String str1 = "Implementation";
        System.out.println("Initial string: " + str);
        System.out.println("Result string: |" + reverseWords(str) + "|");
        System.out.println("Initial word: " + str1);
        System.out.println("Result string with StringBuilder: " + reverseWordsStringBuilder(str1));
    }
}
