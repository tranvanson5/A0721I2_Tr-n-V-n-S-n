package list.baitap.LinkList;


public class MyLinkedList {
    private Node head;
    public int numNodes=0;
    //public MyLinkedList() {}
    public MyLinkedList(Object data) {
        head=new Node(data);
        numNodes++;
    }

    public MyLinkedList() {

    }

    class Node{
       public Node next;
       private Object data;

       public Node(Object data) {
           this.data = data;
       }

       public Object getData() {
           return this.data;
       }
   }
   void addLast(Object data){
        Node temp=head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next=new Node(data);
       numNodes++;
   }
    void addFirst(Object data){
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        numNodes++;
    }
    void add(int index,Object data ){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    void removeIndex(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next.next;
            temp.next = holder;
            numNodes--;
        }
    }
    void removeObject(Object o){
        while (contains(o)==true){
            if (indexOf(o)>=0) removeIndex(indexOf(o));
        }
    }
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp=head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public int getSize() {
        return numNodes;
    }
    public int indexOf(Object o){
        int position=0;
        Node temp=head;
        while (temp!=null){
            if(temp.data==o){
                return position;
            }
            position++;
            temp=temp.next;
        }
        return -1;
    }
    public boolean contains(Object o){
        Node temp=head;
        while (temp!=null){
            if(temp.data==o){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

//    public Object clone() {
//        Node temp=head;
//        MyLinkedList clone = new MyLinkedList();
//        while (temp!=null){
//            clone.addLast(temp.data);
//            temp=temp.next;
//        }
//        return clone;
//    }
}
