package q_2154_KeepMultiplyingFoundValuesByTwo;


/*You are given an array of integers nums. 
 * You are also given an integer original which is the first number that needs to be searched for in nums.

You then do the following steps:

If original is found in nums, multiply it by two (i.e., set original = 2 * original).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of original.


Constraints:

1 <= nums.length <= 1000
1 <= nums[i], original <= 1000



*/


class Solution {
    public static int findFinalValue(int[] nums, int original) {
        
        boolean found = false;
        while(!found){
            found = true;
            for(int i = 0 ;i<nums.length;i++){
                if(original == nums[i]){
                    original = 2*nums[i];
                    nums[i] = 0;
                    found = false; 
                }
            }               
        }
        return original;
    }
}
