package q_1528_ShuffleString;

/*
You are given a string s and an integer array indices of the same length. 
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
*/

/*
Constraints:

s.length == indices.length == n
1 <= n <= 100
s consists of only lowercase English letters.
0 <= indices[i] < n
All values of indices are unique.
*/

class Solution {
    public static String restoreString(String s, int[] indices) {
        String str = "";
        char[] chars = s.toCharArray();
        int l =chars.length;
        char[] strChars = new char[l];
        for(int i =0;i<l;i++){
            strChars[indices[i]] = chars[i];
        }
        return new String(strChars);
    }
}
