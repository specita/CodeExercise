package leetcode;

import java.util.HashMap;

/**
 * Created by p.chen on 2016/5/6.
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    /**
     * my solution
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : sChars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char[] tChars = t.toCharArray();
        for (Character c : tChars) {
            Integer integer = map.get(c);
            if (integer == null || integer == 0) {
                return false;
            }
            map.put(c, --integer);
        }

        return true;
    }

    /**
     * leetcode best vote java solution
     * Í°ÅÅÐòµÄË¼Ïë
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagramV2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] array = new int[26];

        for (Character c : s.toCharArray()) {
            array[c - 'a']++;
        }

        for (Character c : t.toCharArray()) {
            if (array[c - 'a'] == 0) {
                return false;
            }
            array[c - 'a']--;
        }
        return true;
    }

}
