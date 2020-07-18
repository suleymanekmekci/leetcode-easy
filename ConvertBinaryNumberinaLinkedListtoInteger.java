/**
 *Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 * Return the decimal value of the number in the linked list
 *
 * Example 1:
 *
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class getDecimalValue {
    public int getDecimalValue(ListNode head) {

        int total = 0;

        ListNode n = head;
        int counter = 0;

        while (n.next != null) {
            counter++;
            n = n.next;
        }


        ListNode m = head;
        while (m.next != null) {

            if (m.val != 0) {
                total += Math.pow(2,counter);
            }

            m = m.next;
            counter--;
        }

        if (m.val != 0) {
            total += Math.pow(2,counter);
        }
        
        return total;

    }
}
