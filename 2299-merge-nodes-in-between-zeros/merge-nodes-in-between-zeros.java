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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode ptr=head.next;
        ListNode prev=head;
        int s=0;
        while(ptr !=null)
        {
            if(ptr.val==0)
            {
                ListNode nn=new ListNode(s);
                s=0;
                prev.next=nn;
                prev=nn;
            }
            else
                s+=ptr.val;
                ptr=ptr.next;
        }
        return head.next;
    }
}