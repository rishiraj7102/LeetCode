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

//
        SinglyLinkedList list=new SinglyLinkedList();
//        System.out.println(list.size);
        list.addFirst(100);
        list.addFirst(200);
        list.addFirst(300);
        list.display();
        list.insertusingRecursion(40,1);
        System.out.println(list.returnhead());
        list.display();
        System.out.println(list.size);

    }
}
