//19. Remove Nth Node From End of List

..java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy,q=dummy;
        
        for(int i=0;i<n;i=i+1){
           q=q.next; 
        }
        
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        p.next=p.next.next;
        return dummy.next;//不能返回 head 因为 head有可能也被删除了
    }
}