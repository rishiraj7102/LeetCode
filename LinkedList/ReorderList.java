package LinkedList;
//https://leetcode.com/problems/reorder-list/
public class ReorderList {
    public static void main(String[] args) {

    }
    static void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }
        ListNode mid=middleNode(head);
        ListNode reversedhead=reverseLLinPlace(mid);
        ListNode hf=head;
        ListNode hs=reversedhead;
        while (hf!=null && hs!=null)
        {
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null)
        {
            hf.next=null;
        }
    }
    static ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while (f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    static ListNode reverseLLinPlace(ListNode head)
    {
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;

        while (pres!=null)
        {
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)
                next=next.next;
        }

        return prev;
    }
}
