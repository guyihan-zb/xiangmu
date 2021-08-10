//反转链表


public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode p = null;
        while(head!=null){
            p = head.next;
            head.next = pre;
            pre = head;
            head = p;
        }
        return pre;
    }
}
