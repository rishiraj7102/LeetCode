package SortingAssignments;

import java.util.List;

//insertion sort on linked list
//https://leetcode.com/problems/insertion-sort-list/
public class InsertionSortList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        ListNode head=new ListNode(5);
        ListNode node1=new ListNode(4);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(2);
        ListNode node4=new ListNode(1);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;

        ListNode newh=insertionSortList(head);
        display(newh);
    }
    static void display(ListNode head)
    {
        while (head!=null)
        {
            System.out.println(head.val);
            head=head.next;
        }
    }
    static ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode tail=head;
        ListNode temp=head.next;
        while (temp!=null)
        {
            if(temp.val<head.val)
            {
                ListNode temp2=temp.next;
                temp.next=head;
                tail.next=temp2;
                head=temp;
                temp=temp2;
            }
            else if(temp.val>head.val && temp.val<tail.val)
            {
                ListNode newhead=head;
                while (newhead.val< temp.val)
                {
                    if(newhead.next.val> temp.val)
                    {
                        break;
                    }
                    newhead=newhead.next;
                }
                ListNode temp2=temp.next;
                if(temp2==null)
                {
                    tail.next=null;
                }
                ListNode newtail=newhead.next;
                newhead.next=temp;
                temp.next=newtail;
                if(newtail!=null && temp2!=null)
                {
                    newtail.next=temp2;
                }

                temp=temp2;
            }
           else {
               tail=temp;
               temp=temp.next;

            }

        }
        return head;
    }

}
