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
    public ListNode middleNode(ListNode head) {                 //middlenode
        if(head == null || head.next == null)
        {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverseList(ListNode head) {                //reverse
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode P = null,C = head;
        
        while(C != null)
        {   ListNode N = C.next;
         
            C.next = P;
            P = C;
            C = N;
        }
        return P;
    }
    
    
    public void reorderList(ListNode head) {                    //reorder
        if(head == null || head.next == null)
        {
            return ;
        }
        
        ListNode mid = middleNode(head);
        ListNode nhead = mid.next;
        mid.next = null;
        
        nhead = reverseList(nhead);
        
        ListNode n1 = head, n2 = nhead;
        
        while(n2 != null)
        {
            ListNode f1 = n1.next,f2 = n2.next;
            
            n1.next = n2;
            n2.next = f1;
            
            n1 = f1;
            n2 = f2;
            
        }
        
        
    }
}