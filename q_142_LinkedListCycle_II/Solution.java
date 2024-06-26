package q_142_LinkedListCycle_II;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 */
 class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

/*
 * Given the head of a linked list, return the node where the cycle begins. If
 * there is no cycle, return null.
 * 
 * There is a cycle in a linked list if there is some node in the list that can
 * be reached again by continuously following the next pointer. Internally, pos
 * is used to denote the index of the node that tail's next pointer is connected
 * to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as
 * a parameter.
 * 
 * Do not modify the linked list.
 */

/*
 * Constraints:
 * 
 * The number of the nodes in the list is in the range [0, 104]. -105 <=
 * Node.val <= 105 pos is -1 or a valid index in the linked-list.
 * 
 */

public class Solution {
	public ListNode detectCycle(ListNode head) {
		if (head == null) {
			return null;
		}
		ArrayList<ListNode> list = new ArrayList<>();
		ListNode trav = head;
		if (head.next == head) {
			return head;
		}
		while (trav.next != null) {
			if (list.contains(trav)) {
				return trav;
			}
			list.add(trav);
			trav = trav.next;
		}

		return null;
	}
}


