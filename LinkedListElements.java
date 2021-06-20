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
class Remove LinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        ListNode check = new ListNode();
        check.next = head;
        ListNode body = check;
        while(check.next != null){
            if(check.next.val == val)
                check.next = check.next.next;
            else
                check = check.next;
        }
        return body.next;
    }
}