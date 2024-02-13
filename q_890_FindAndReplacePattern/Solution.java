package q_890_FindAndReplacePattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.
*/

/*
Constraints:

1 <= pattern.length <= 20
1 <= words.length <= 50
words[i].length == pattern.length
pattern and words[i] are lowercase English letters.
*/


class Solution {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();
        char[] chars = pattern.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        int count =0;
        for(char c : chars){
            if(!map.containsKey(c)){
                map.put(c,count++);
            }
        }
        String pat = "";
        for(int i =0;i<chars.length;i++){
            int temp = map.get(chars[i]);
            pat += "_"+temp;
        }
//        System.out.println(pat);
        for(String str : words){
            chars = str.toCharArray();
            map = new HashMap<>();
            count =0;
            for(char c : chars){
                if(!map.containsKey(c)){
                    map.put(c,count++);
                }
            }
            String ret = "";
            for(int i =0;i<chars.length;i++){
                int temp = map.get(chars[i]);
                ret += "_"+temp;
            }
            if(ret.equals(pat)){
//                System.out.println(ret);
                list.add(str);
            }
        }
        return list;
    }
}