/*
Contains template for LinkedList problems :::
 */
/*
Functions :::
1 . GetMiddle(ListNode) :::
2 . GetLength(ListNode) :::
3 . Reverse(ListNode)   :::
 */
public class ListNode {
    int val ;
    ListNode next ;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
        this.next = null ;
    }
// 1 . GetMiddle(ListNode) :::
    public ListNode GetMiddle(ListNode head) {
        if (head == null || head.next == null)
            return head ;
        if(head.next.next == null)
            return head.next ;
        ListNode tortoise = head ;
        ListNode hare     = head ;
        while (hare != null && hare.next != null){
            tortoise = tortoise.next ;
            hare     = hare.next.next ;
        }
        return tortoise ;
    }
// 2 . GetLength(ListNode) :::
    public int GetLength(ListNode head , int length) {
        if (head == null)
            return length ;
        return GetLength(head.next , length+1) ;
    }
// 3 . Reverse(ListNode)   :::
    public ListNode Reverse(ListNode head) {
        ListNode forward ;
        ListNode prev = null ;
        ListNode current = head ;
        while (current != null) {
            forward = current.next ;
            current.next = prev ;
            prev = current ;
            current = forward ;

        }
        return prev ;
    }
}
