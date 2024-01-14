package q_75_SortColors;

/*
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
 * with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
 * */

/*
 * Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 */

class Solution {
    public static void sortColors(int[] nums) {
        int zeroes =0;
        int ones =0;
        int l =nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                zeroes++;
            }else if(nums[i]==1){
                ones++;
            }
        }
        for(int i =0;i<zeroes;i++){
            nums[i] = 0;
        }
        for(int i =zeroes;i<(zeroes+ones);i++){
            nums[i] = 1;
        }
        
        for(int i =(zeroes+ones);i<l;i++){
            nums[i] = 2;
        }
        
    }
}
