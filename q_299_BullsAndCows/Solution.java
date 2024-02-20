package q_299_BullsAndCows;

import java.util.ArrayList;
import java.util.List;


/*
You are playing the Bulls and Cows game with your friend.

You write down a secret number and ask your friend to guess what the number is. 
When your friend makes a guess, you provide a hint with the following info:

The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. 
Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.

The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.
*/

/*
Constraints:

1 <= secret.length, guess.length <= 1000
secret.length == guess.length
secret and guess consist of digits only.
*/

class Solution {
    public static String getHint(String secret, String guess) {
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        List<Character> sList = new ArrayList<>();
        List<Character> gList = new ArrayList<>();
        int l = guess.length();
        int x =0;
        int y =0;
        for(int i= 0;i<l;i++){
            if(s[i]==g[i]){
                x++;
            }else{
                sList.add(s[i]);
                gList.add(g[i]);
            }
        }
        for(int i = 0;i<sList.size();i++){
            if(gList.contains(sList.get(i))){
                gList.remove(sList.get(i));
                y++;
            }
        }
        return ""+x+"A"+y+"B";
    }
}
