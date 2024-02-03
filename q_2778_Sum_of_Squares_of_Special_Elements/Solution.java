package q_2778_Sum_of_Squares_of_Special_Elements;

/*
 * You are given a 1-indexed integer array nums of length n.

An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.

Return the sum of the squares of all special elements of nums.
 */

/*
 * Constraints:

1 <= nums.length == n <= 50
1 <= nums[i] <= 50
*/


class Solution {
    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        int l = nums.length;
        for(int i =1 ;i<=l;i++){
            if(l%i==0){
                sum+=nums[i-1]*nums[i-1];
            }
        }
        return sum;
    }
}