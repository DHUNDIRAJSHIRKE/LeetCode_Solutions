package q_345_ReverseVowelsOfAString;

import java.util.ArrayList;

/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
*/


/*
Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/



class Solution {
    public static String reverseVowels(String s) {
        ArrayList<Integer> indices = new ArrayList<>();
        ArrayList<Character> allVowels = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>();
        char[] chars = s.toCharArray();
        allVowels.add('A');
        allVowels.add('E');
        allVowels.add('I');
        allVowels.add('O');
        allVowels.add('U');
        allVowels.add('a');
        allVowels.add('e');
        allVowels.add('i');
        allVowels.add('o');
        allVowels.add('u');
        for(int i =0 ;i<chars.length;i++){
            if(allVowels.contains(chars[i])){
                indices.add(i);
                vowels.add(chars[i]);
            }
        }
        int l = indices.size();
        String ret= "";
        for(int i=0;i<l;i++){
            chars[indices.get(i)] = vowels.get(l-i-1);
        }
        for(char c : chars){
            ret += c;
        }
        return ret;
    }
}


//two pointer method
class Solution1 {
    public static String reverseVowels(String s) {
        ArrayList<Character> allVowels = new ArrayList<>();
        char[] chars = s.toCharArray();
        allVowels.add('A');
        allVowels.add('E');
        allVowels.add('I');
        allVowels.add('O');
        allVowels.add('U');
        allVowels.add('a');
        allVowels.add('e');
        allVowels.add('i');
        allVowels.add('o');
        allVowels.add('u');
        int left = 0;
        int l = chars.length;
        int right = l-1;
        boolean leftPresent = false;
        boolean rightPresent = false;
        while(left<right){
            if(leftPresent && rightPresent ){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                leftPresent = false;
                rightPresent = false;
                left++;
                right--;
            }
            if(allVowels.contains(chars[left])){
                leftPresent = true;
            }
            if(allVowels.contains(chars[right])){
                rightPresent = true;
            }
            if(!allVowels.contains(chars[left])){
                left++;
            }
            if(!allVowels.contains(chars[right])){
                right--;
            }
        }
        String ret= "";
        for(char c : chars){
            ret += c;
        }
        return ret;
    }
}