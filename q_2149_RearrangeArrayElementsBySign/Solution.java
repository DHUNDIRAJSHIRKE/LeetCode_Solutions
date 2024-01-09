package q_2149_RearrangeArrayElementsBySign;

/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

Constraints:

2 <= nums.length <= 2 * 105
nums.length is even
1 <= |nums[i]| <= 105
nums consists of equal number of positive and negative integers.

*/

class Solution {
    public static int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int[] pos = new int[l/2];
        int[] negs = new int[l/2];
        int p =0;
        int n =0;
        for(int num : nums){
            if(num<0){
                negs[n++] = num;
            }else{
                pos[p++] = num;
            }
        }
        p=0;
        n=0;
        for(int i =0;i<l/2;i++){
            nums[2*i] = pos[p++];
            nums[2*i+1]= negs[n++];
        }
        return nums;
    }
}