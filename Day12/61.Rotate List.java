/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
```java 

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) 
            return head;
        
        ListNode end=head;
        int length=1;
        while(end.next!=null){
            length=length+1;
            end=end.next;
        }
        int move=length-k%length;
        
        end.next=head;//lock the head to the end
        for(int i=0;i<move;i++){
            end=end.next;//找到新的尾巴
        }
        head=end.next;//要多走一步
        end.next=null;
        return head;
        
    }
}

``` 