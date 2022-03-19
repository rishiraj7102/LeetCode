package LinkedList;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 class ListNode {
        int val;
        ListNode next;
      ListNode() {}
       ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class RemoveDuplicates {
    public static void main(String[] args) {
//        ListNode
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while (temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                temp.next=temp.next.next;
            }
            else
                temp=temp.next;
        }
        return head;
    }
}
