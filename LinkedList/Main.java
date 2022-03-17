package LinkedList;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList list=new SinglyLinkedList();
//        list.addFirst(3);
//        list.addFirst(5);
//        list.addFirst(10);
//
//        list.addLast(100);
//
//        list.addAtIndex(45,2);
//
//        list.display();
//        System.out.println(list.size);
//
//        list.deletefirst();
//        list.deleteLast();
//
//        list.display();
//        System.out.println(list.size);
//
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addFirst(3);
//
//        list.display();
//        System.out.println(list.size);
//
//        list.deleteAtIndex(2);
//
//        list.display();
//        System.out.println(list.size);

//

        CircularLL list=new CircularLL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(556);
        list.insert(65);

        list.display();
        System.out.println(list.size);

        list.delete(30);

        list.display();
        System.out.println(list.size);

    }
}
