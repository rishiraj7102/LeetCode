package LinkedList;

public class DoublyLL {
    private  Node head;
    int size;
    DoublyLL()
    {
        this.size=0;
    }

    public void addAfterNumber(int number,int val)
    {
        Node head2=head;
        Node temp=new Node(val);
        while (head2.val!=number)
        {
            head2=head2.next;
        }
        temp.next=head2.next;
        head2.next=temp;
        temp.previous=head2;
        if(head2.next!=null)
        {
            head2.next.previous=temp;
        }
        size++;
    }
    public void addLast(int  val)
    {
        Node temp=new Node(val);
        Node head2=head;
        while (head2.next!=null)
        {
            head2=head2.next;
        }
        head2.next=temp;
        temp.next=null;
        temp.previous=head2;
        size++;
    }
    public void addFirst(int val)
    {
        Node temp=new Node(val);
        temp.next=head;
        temp.previous=null;
        if(head!=null)
        {
            head.previous=temp;
        }
        head=temp;
        size++;
    }

    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    class Node{
        int val;
        Node previous;
        Node next;

        Node(int val)
        {
            this.val=val;
        }

        public Node(int val, Node previous, Node next) {
            this.val = val;
            this.previous = previous;
            this.next = next;
        }
    }
}
