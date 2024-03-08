package q_141_LinkedListCycle;

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. 
Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
*/

/*
Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 

Follow up: Can you solve it using O(1) (i.e. constant) memory?
*/

public class Solution {
	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		if (head.next == head) {
			return true;
		}
		if (head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		boolean even = false;
		while (fast.next != null) {
			if (fast == slow) {
				return true;
			}
			if (!even) {
				slow = slow.next;
				even = true;
			} else {
				even = false;
			}
			fast = fast.next;
		}

		return false;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
