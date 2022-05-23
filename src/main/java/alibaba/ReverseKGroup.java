package main.java.alibaba;


/**
 given a linkedlist, reverse every k node and return the result linked list。
 k is an integer which is lower than or equal to the linked list size.
 if the list size is not integral multiple of k, then appends the last nodes in original order.

 sample1:
 input:head = [1,2,3,4,5], k = 2
 output: [2,1,4,3,5]

 sample2:
 input:head = [1,2,3,4,5], k = 3
 output: [3,2,1,4,5]

 sample3:
 input:head = [1,2,3,4,5], k = 1
 output: [1,2,3,4,5]

 sample4:
 input:head = [1], k = 1
 output: [1]
 */
public class ReverseKGroup {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode rtn = new ListNode();
        ListNode tmp = new ListNode();
        ListNode n = head;
        int len = 1;
        while(n.next!=null){
            n=n.next;
            len++;
        }
        if(k > len){
            return head;
        }

        n = head;
        rtn = tmp;
        for(int len2 = len/k; len2 > 0; len2--){
            int i = 0;
            while(i < k){
                ListNode nextNode = n.next;
                n.next= tmp.next;
                tmp.next = n;
                n=nextNode;
                i++;
            }
            while(tmp.next != null){
                tmp = tmp.next;
            }
        }
        tmp.next= n;
        return rtn.next;

    }
}
