package q_4_MedianOfTwoSortedArrays;

import java.util.Arrays;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        double[] nums = new double[l1+l2];
        int l = nums.length;
        for(int i=0;i<l1;i++){
            nums[i] = nums1[i];
        }
        for(int i =0;i<l2;i++){
            nums[l1+i] = nums2[i];
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        if(l%2==0){
            double med = (nums[(l/2)-1]+nums[l/2])/2;
            return med;
        }else{
            double med = nums[l/2]; 
            return med;
        }

    }
}
