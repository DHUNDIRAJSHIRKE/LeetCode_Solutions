package q_2540_MinimumCommonValue;



/*Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. 
 * If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

Constraints:

1 <= nums1.length, nums2.length <= 105
1 <= nums1[i], nums2[j] <= 109
Both nums1 and nums2 are sorted in non-decreasing order.

*/



class Solution {
    public static int getCommon(int[] nums1, int[] nums2) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0 ;i<nums1.length;i++){
        //     map.put(nums1[i],1);
        // }
        // for(int i = 0 ;i<nums2.length;i++){
        //     if(map.containsKey(nums2[i])){
        //         return nums2[i];
        //     }
        // }

        for(int i = 0 ; i<nums1.length;i++){
            for(int j = 0 ;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    return nums1[i];
                }
                if(nums1[i]<nums2[j]){
                    break;
                }
            }
        }
        return -1;
    }
}
