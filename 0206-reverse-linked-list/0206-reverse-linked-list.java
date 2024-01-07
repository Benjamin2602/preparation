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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode prevNode = null; //prev->null;
        ListNode curNode = head;  //cur->head
        
        while(curNode !=null){
            ListNode nextNode = curNode.next; // head->curr // next->curr.next // next->head.next
            curNode.next = prevNode; // switching the next pointer to prev 
            prevNode = curNode; //prev points to currentNode
            curNode = nextNode;  //currentNode points to nextNOde
        }
        head = prevNode;
        return head;
        
    }
}