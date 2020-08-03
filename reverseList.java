/** 206. Reverse Linked List
 *  https://leetcode.com/problems/reverse-linked-list/
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class reverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        Stack<Integer> nodeVals = new Stack<>();

        while (head.next != null) {
            nodeVals.push(head.val);
            head = head.next;
        }
        nodeVals.push(head.val);

        ListNode output = new ListNode(nodeVals.pop());

        ListNode temp = output;

        while (!nodeVals.isEmpty()) {
            temp.next = new ListNode(nodeVals.pop());
            temp = temp.next;
        }
        return output;

    }
}
