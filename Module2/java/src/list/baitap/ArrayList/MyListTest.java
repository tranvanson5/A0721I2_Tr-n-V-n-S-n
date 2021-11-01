package list.baitap.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList=new MyList();
        System.out.println("Add: ");
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.printList();
        System.out.println();

        System.out.println("Add: ");
        myList.addFist(10);
        System.out.println();

        System.out.println("Remove position: ");
        myList.removePosition(1);
        myList.printList();
        System.out.println();

        System.out.println("Remove value: ");
        myList.removeValue(3);
        myList.printList();
        System.out.println();

        System.out.println("Insert: ");
        myList.inset(0,4);
        myList.printList();
        System.out.println();

        System.out.println("Size arraylist:");
        System.out.println(myList.getSize());
        System.out.println();

        System.out.println("Position of value: ");
        System.out.println(myList.indexOf(4));

        System.out.println("Copy arraylist: ");
        myList.clone();
        System.out.println(myList.clone());

        System.out.println("Check element: ");
        System.out.println(myList.contains(0));
        System.out.println();

        System.out.println("Clear Arraylist");
        myList.clear();
    }
}
