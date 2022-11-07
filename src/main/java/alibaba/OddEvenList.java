package main.java.alibaba;

/*
given list head node "head", pls join odd nodes and even nodes respectively.
sample:
[1,2,3,4,5] -> [1,3,5,2,4]
[2,1,3,5,6,4,7] -> [2,3,6,7,1,5,4]
 */
public class OddEvenList {
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
        public ListNode oddEvenList(ListNode head) {
            if(head==null) return head;
            ListNode lastodd=head, lastEven=head.next;
            ListNode tmp = null;
            while(lastEven!=null && lastEven.next!=null){
                tmp = lastodd.next;
                lastodd.next=lastEven.next;
                lastEven.next = lastEven.next.next;
                lastodd.next.next=tmp;
                lastodd=lastodd.next;
                lastEven=lastEven.next;
            }
            return head;
        }

}
