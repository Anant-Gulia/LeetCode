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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
	if(head == null)
	    return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null)
            slow = slow.next;
        slow = reverseList(slow);
        fast = head;
        while(slow != null) {
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode reversed = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = reversed;
            reversed = head;
            head = next;
        }
        return reversed;
    }
}