package q_2785_SortVowelsInAString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given a 0-indexed string s, permute s to get a new string t such that:

All consonants remain in their original places. 
More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
The vowels must be sorted in the nondecreasing order of their ASCII values. 
More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, 
then t[i] must not have a higher ASCII value than t[j].
Return the resulting string.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. 
Consonants comprise all letters that are not vowels.
*/


/*
Constraints:

1 <= s.length <= 105
s consists only of letters of the English alphabet in uppercase and lowercase.
*/


class Solution {
    public static String sortVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
        List<Character> allVowels = new ArrayList<>();
        allVowels.add('a');
        allVowels.add('e');
        allVowels.add('i');
        allVowels.add('o');
        allVowels.add('u');
        allVowels.add('A');
        allVowels.add('E');
        allVowels.add('I');
        allVowels.add('O');
        allVowels.add('U');
        for(int i= 0;i<chars.length;i++){
        	
            if(allVowels.contains(chars[i])){
                vowels.add(chars[i]);
                indices.add(i);
            }
        }
        System.out.println(" before SOrting vowels: " +vowels);
        System.out.println(" indices: " +indices);
        Collections.sort(vowels);
        System.out.println(" after SOrting vowels: " +vowels);
        for(int i =0;i<indices.size();i++){
            chars[indices.get(i)] = vowels.get(i);
        }
        String ret = "";
        for(char c : chars){
            ret += c;
        }
        return ret;
    }
}