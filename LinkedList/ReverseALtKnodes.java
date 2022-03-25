package LinkedList;

public class ReverseALtKnodes {

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        ListNode head=reverseKGroup(node1,2);
        while (head!=null)
        {
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.print("Null");
    }
    static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k<=1)
        {
            return head;
        }
        int count=1;
        ListNode temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        int iterations=count/k;
        ListNode prev=null;
        ListNode current=head;

        for(int i=0;i<iterations;i++)
        {
            if(i%2!=0)
            {
                continue;
            }
            ListNode last=prev;
            assert current != null;
            ListNode next=current.next;
            ListNode newEnd=current;
            for(int j=0;j<k;j++)
            {
                assert current != null;
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null)
                    next=next.next;
            }
            if(last==null)
            {
                head=prev;
            }
            else {
                last.next=prev;
            }
            newEnd.next=current;
            prev=newEnd;
//            iterations--;
        }
        return head;
    }
}
