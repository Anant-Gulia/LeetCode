/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode bodyA = headA;
        ListNode bodyB = headB;
        while(bodyA != bodyB){
            if(bodyA == null)
                bodyA = headB;
            else
                bodyA = bodyA.next;
            if(bodyB == null)
                bodyB = headA;
            else
                bodyB = bodyB.next;
        }
        return bodyA;
    }
}