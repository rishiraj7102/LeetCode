package LinkedList;
//https://leetcode.com/problems/rotate-list/
public class RotateLL {
    public static void main(String[] args) {
        ListNode node1=new ListNode(0);
        ListNode node2=new ListNode(1);
        ListNode node3=new ListNode(2);
//        ListNode node4=new ListNode(4);
//        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
//        node4.next=node5;
//        node5.next=null;

        ListNode head=rotateRight(node1,4);
        while (head!=null)
        {
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.print("Null");
    }
    static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode start=head;
        ListNode p=getprevious(head);
        ListNode end=p.next;
        ListNode temp=head;
        int count=1;
        while (temp.next!=null)
        {
            temp=temp.next;
            count ++;
        }
        int rotations=k%count;
        while (rotations>0)
        {
            end.next=start;
            p.next=null;
            start=end;
            end=p;
            p=getprevious(start);
            rotations--;
        }
        return start;
    }
    static ListNode getprevious(ListNode head)
    {
        ListNode temp=head;
        while (temp.next.next!=null)
        {
            temp=temp.next;
        }
        return temp;
    }
}
