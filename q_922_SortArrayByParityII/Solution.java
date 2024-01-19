package q_922_SortArrayByParityII;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l = nums.length;
        int[] odds = new int[l/2];
        int[] evens = new int[l/2];
        int odd =0;
        int even =0;

        for(int num : nums){
            if(num%2==0){
                evens[even++] = num;
            }else{
                odds[odd++] = num;
            }
        }
        odd =0;
        even =0;
        for(int i=0;i<l/2;i++){
            nums[i*2] = evens[even++];
            nums[i*2+1] = odds[odd++];
        }
        return nums;
    }
}