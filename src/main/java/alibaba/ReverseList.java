package main.java.alibaba;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseList {

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public ListNode reverseList(ListNode head) {
            if(head == null) return head;
            ListNode newHead = reverse(head);
            head.next = null;
            return newHead;
        }

        private ListNode reverse(ListNode n){
            if(n != null && n.next != null){
                ListNode next = n.next;
                ListNode newN = reverse(next);
                next.next = n;
                return newN;
            }
            return n;
        }
}
