package q_2032_TwoOutOfThree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*Given three integer arrays nums1, nums2, and nums3, 
 *return a distinct array containing all the values that are present in at least two out of the three arrays.
 *You may return the values in any order.*/
public class Solution {

	public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		List<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		for (int i : nums1) {
			if (!list1.contains(i)) {
				list1.add(i);
			}
		}
		for (int i : nums2) {
			if (!list2.contains(i)) {
				list2.add(i);
			}
		}
		for (int i : nums3) {
			if (!list3.contains(i)) {
				list3.add(i);
			}
		}
		for (int i : nums1) {
			if (list2.contains(i) || list3.contains(i)) {
				if (!list.contains(i)) {
					list.add(i);
				}
			}
		}
		for (int i : nums2) {
			if (list1.contains(i) || list3.contains(i)) {
				if (!list.contains(i)) {
					list.add(i);
				}
			}
		}
		for (int i : nums3) {
			if (list2.contains(i) || list1.contains(i)) {
				if (!list.contains(i)) {
					list.add(i);
				}
			}
		}
		return list;
	}
	/*                   using HashMap
	 * 
	 * 
	public List<Integer> twoOutOfThree1(int[] nums1, int[] nums2, int[] nums3) {
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		HashMap<Integer, Integer> map3 = new HashMap<>();
		for (int i : nums1) {
			map1.putIfAbsent(i, 1);
		}
		for (int i : nums2) {
			map2.putIfAbsent(i, 1);
		}
		for (int i : nums3) {
			map3.putIfAbsent(i, 1);
		}
		for (int i : nums1) {
			if (map2.containsKey(i) || map3.containsKey(i)) {
				if (!list.contains(i)) {
					list.add(i);
				}
			}
		}
		for (int i : nums2) {
			if (map1.containsKey(i) || map3.containsKey(i)) {
				if (!list.contains(i)) {
					list.add(i);
				}
			}
		}
		for (int i : nums3) {
			if (map2.containsKey(i) || map1.containsKey(i)) {
				if (!list.contains(i)) {
					list.add(i);
				}
			}
		}
		return list;
	}*/
	
	
	
	
}
