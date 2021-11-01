package list.baitap.ArrayList;

import java.util.Arrays;

public class MyList <E>{
    int size=0;
    static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList() {
        elements= new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapacity(){
        int newsize= elements.length*2;
        elements= Arrays.copyOf(elements,newsize);
    }

    public int getSize() {
        return size;
    }
    void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public E addFist(int value){
        inset(0 ,value);
        return (E)elements;
    }
    public E inset(int pos, int value){
        if (pos >= size || pos < 0){
            throw new IndexOutOfBoundsException("Positon: " + pos + " ,size: " + (size - 1));
        } else {
            for (int i=size;i > pos; i--) {
                elements[i] = elements[i - 1];
            }
            elements[pos]=value;
        }
        return (E) elements;
    }
    public void printList() {
        for(int i = 0 ; i < size ; i++) {
            System.out.println(elements[i]);
        }
    }
    public int indexOf(E value){
        for(int i = 0 ; i < size ; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public E removePosition(int pos){
        if (pos > size || pos < 0){
            throw new IndexOutOfBoundsException("Positon: " + pos + " ,size: " + (size - 1));
        } else {
            for (int i=pos;i < size; i++){
                elements[i]=elements[i+1];
            }
        }
        return (E) elements;
    }
    public E removeValue(Object o){
        if (indexOf((E) o)!=-1) {
            removePosition(indexOf((E) o));
        }

        return (E) elements;
    }

    public E clone(){
        Object elementsCopy[] = new Object[elements.length];
         elementsCopy = (Object[]) elements;
        return (E) elementsCopy;
    }
    public boolean contains(E value){
        if (indexOf(value)!=-1){
            return true;
        }
        return false;
    }
    void clear(){
        elements=null;
        size=0;
    }
}
