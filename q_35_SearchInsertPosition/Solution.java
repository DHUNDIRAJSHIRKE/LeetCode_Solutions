package q_35_SearchInsertPosition;

/*Given a sorted array of distinct integers and a target value, 
 *return the index if the target is found.
 *If not, return the index where it would be if it were inserted in order.
 *You must write an algorithm with O(log n) runtime complexity.
*/

class Solution {
	public int searchInsert(int[] nums, int target) {
		int l = nums.length;
		int left = 0;
		int right = l - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;
	}
}