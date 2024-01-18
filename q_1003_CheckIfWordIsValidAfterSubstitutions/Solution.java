package q_1003_CheckIfWordIsValidAfterSubstitutions;

/*
 * Given a string s, determine if it is valid.

A string s is valid if, starting with an empty string t = "", 
you can transform t into s after performing the following operation any number of times:

Insert string "abc" into any position in t. 
More formally, t becomes tleft + "abc" + tright, where t == tleft + tright. Note that tleft and tright may be empty.
Return true if s is a valid string, otherwise, return false.
 */

/*Constraints:

1 <= s.length <= 2 * 104
s consists of letters 'a', 'b', and 'c'

*/

class Solution {
    public static boolean isValid(String s) {
        int l = s.length();
        if(l%3!=0){
            return false;
        }
        while(s.length()!=0){
            s = removeAbc(s);
            if(s.length()%3!=0) {
            	return false;
            }
        }
        if(s.equals("abc") || s.equals("")){
            return true;
        }else{
            return false;
        }
    }
    public static String removeAbc(String s){
    	boolean present = false;
        int l = s.length();
        if(l==3) {
        	if(s.equals("abc")) {
        		return "";
        	}else {
        		return "a";
        	}
        }
        for(int i= 0;i<l-2;i++){
            if(s.substring(i,i+3).equals("abc")){
            	present = true;
            	if(i==0) {
            		s = s.substring(i+3, l);
            	}else {            		
            		s= s.substring(0,i) + s.substring(i+3);
            	}
                break;
            }
        }
        if(!present) {
        	return "a";
        }
        return s;
    }
}