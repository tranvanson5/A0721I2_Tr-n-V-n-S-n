package list.baitap.LinkList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList(10);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(9);
        myLinkedList.add(5,100);
        myLinkedList.removeIndex(2);
        System.out.println("size : "+myLinkedList.getSize());
        myLinkedList.removeObject(3);
        myLinkedList.printList();
        System.out.println("indexOf: "+myLinkedList.indexOf(5));
        System.out.println("Contains: "+myLinkedList.contains(5));
//        MyLinkedList myLinkedList1 =new MyLinkedList();
//        myLinkedList1.clone();
//        myLinkedList1.printList();
    }
}
