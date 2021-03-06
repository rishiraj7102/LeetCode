package LinkedList;

import OOP.Singleton;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    int size=0;

    public SinglyLinkedList()
    {
        this.size=0;
    }
    private class Node{
        int value;
        Node next;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }

    public  void  Bubble()
    {
        bubblesort(size-1,0);
    }

    private void bubblesort(int r, int c) {
        if(r==0)
        {
            return;
        }
            if(c<r)
            {
                Node f=get(c);
                Node s=get(c+1);

               if(f.value>s.value)
               {
                   if(f==head)
                   {
                       head=s;
                       f.next=s.next;
                       s.next=f;
                   }
                   else  if(s==tail)
                   {
                       Node p=get(c-1);
                       p.next=s;
                       tail=f;
                       s.next=f;
                       f.next=null;
                   }
                   else {
                       Node p=get(c-1);
                       p.next=s;
                       f.next=s.next;
                       s.next=f;
                   }
               }
                bubblesort(r,c+1);
            }
            else {
                bubblesort(r-1,0);
            }



    }

    public void addFirst(int val)       //function to add an element at the first position
    {
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        size++;
        if(tail==null)
        {
            tail=head;
        }

    }

    public void addLast(int val)  //function to add an element at the last
    {
        if(tail==null)
        {
            addFirst(val);
            return;
        }
        Node temp=new Node(val);
        tail.next=temp;
        temp.next=null;
        size++;
    }

    public void addAtIndex(int val,int index) //function to add a node at a given index
    {
        if (index == 0) {
            addFirst(val);
            return;
        }
        if (index == size - 1) {
            addLast(val);
        }

        Node temp=new Node(val);
        Node head2=head;
        for (int i=1;i<index;i++)
        {
            head2=head2.next;

        }
        temp.next=head2.next;
        head2.next=temp;
        size++;
    }

    public int deletefirst() //function to delete the first node in the LL
    {
        int val =head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }

        size--;
        return val;
    }
    public int deleteLast() //function to delete the last element
    {
        Node head2=get(size-2);
        int val=tail.value;
        tail=head2;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index) //function to delete at a particular index
    {
        if(index==0)
        {
            deletefirst();
        }
        else if(index==size-1)
        {
            deleteLast();
        }
        else {
            Node temp=get(index-1);
            int val=temp.next.value;
            temp.next=temp.next.next;
            size--;
            return val;
        }
        return 1;
    }

    public void ReverseusingRecursion(Node node)
    {
        if(node==tail)
        {
            head=tail;
            return;
        }
        ReverseusingRecursion(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public void insertusingRecursion(int val,int index)
    {
           head =  insertRec(val,index,head);
    }
    public int returnhead()
    {
        return head.value;
    }
    private Node insertRec(int val,int index,Node node)
    {
        if(index==0)
        {
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        if(node.next!=null) {
            node.next=insertRec(val, index - 1, node.next);
        }
        return node;
    }


     public Node get(int index) // function to get the node at a particular index
    {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void reverseLLinPlace(Node head)
    {
        Node prev=null;
        Node pres=head;
        Node next=pres.next;

        while (pres!=null)
        {
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)
                next=next.next;
        }
        this.head=prev;
    }

    public Node getNode(int index,Node head)
    {
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }


    public static void main(String[] args) {
        SinglyLinkedList ll=new SinglyLinkedList() ;
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();
//        ll.ReverseusingRecursion(ll.head);
//        ll.reverseLLinPlace(ll.head);
        ll.display();

    }
}
