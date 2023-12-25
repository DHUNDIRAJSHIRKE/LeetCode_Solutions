package q_2942_FindWordsContainingCharacter;

import java.util.ArrayList;
import java.util.List;


/*You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.

Constraints:

1 <= words.length <= 50
1 <= words[i].length <= 50
x is a lowercase English letter.
words[i] consists only of lowercase English letters.

*/

class Solution {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        char[] charArr = null;
        for(int i = 0 ;i<words.length;i++){
            charArr = words[i].toCharArray();
            for(char c : charArr){
                if(c==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
