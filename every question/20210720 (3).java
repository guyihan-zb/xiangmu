//链表中倒数最后k个结点

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param pHead ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode first = pHead;
        for(int i=0;i<k;i++){
            if(first == null) return first;
            first = first.next;
        }
        ListNode last = pHead;
        while(first!=null){
            first = first.next;
            last = last.next;
        }
        return last;
    }
}