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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null )
        {
            return list1 == null ? list2 : list1;
        }
        ListNode c1 = list1, c2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        
        while(c1 != null && c2 != null)
        {
            if(c1.val < c2.val)
            {   ptr.next = c1;
                c1 = c1.next;
            }else{
                ptr.next = c2;
                c2 = c2.next;
            }
            
            ptr = ptr.next;
        }
        ptr.next = (c1 == null ? c2 : c1);
        
        ListNode Head = dummy.next;
        dummy.val = 0;
        dummy.next = null;
        
        return Head;
    }
}