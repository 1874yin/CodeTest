package com.xiaojie;

import java.util.Objects;

/**
 * For a given string that only contains alphabet characters a-z, if 3 or more consecutive
 * characters are identical, remove them from the string. Repeat this process until
 * there is no more than 3 identical characters sitting besides each other.
 */
public class RemoveCharacter {

    public static void main(String[] args) {
        System.out.println(replace("aabcccbbad"));
    }

    /**
     * remove consecutive chars
     * @param input
     * @return
     */
    public static String remove(String input) {
        String result = doRemove(input);
        return !Objects.equals(result, input) ? remove(result) : result.trim();
    }

    public static String doRemove(String input) {
         int left = 0, right = 0;
         for ( ; right < input.length(); right++) {

             if (input.charAt(left) != input.charAt(right)) {
                 left++;
             } else {
                 if (right - left >= 2) {
                     return split_and_merge(input, left);
                 }
             }
         }
         return input;
    }

    private static String split_and_merge(String input, int left) {
        String leftStr = input.substring(0, left);
        String rightStr = input.substring(left + 3);
        return leftStr + rightStr;
    }

    /**
     * replace consecutive chars
     * @param input
     * @return
     */
    public static String replace(String input) {
        String result = doReplace(input);
        return !Objects.equals(result, input) ? replace(result) : result.trim();
    }

    public static String doReplace(String input) {
        int left = 0, right = 0;
        for ( ; right < input.length(); right++) {
            if (input.charAt(left) != input.charAt(right)) {
                left++;
            } else {
                if (right - left >= 2) {
                    return replace_and_merge(input, left);
                }
            }
        }
        return input;
    }

    private static String replace_and_merge(String input, int left) {
        String leftStr = input.substring(0, left);
        String rightStr = input.substring(left + 3);
        char cur = input.charAt(left);
        if (('a' < cur && cur <= 'z') || ('A' < cur && cur <= 'Z')) {
            return leftStr + (char) (cur - 1) + rightStr;
        } else {
            return leftStr + rightStr;
        }
    }
}
