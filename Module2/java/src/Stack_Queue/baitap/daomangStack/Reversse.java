package Stack_Queue.baitap.daomangStack;

import java.util.Stack;

public class Reversse {
    public int[] Reversse(int[] array) {
        Stack stack= new Stack();
        for (int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        for (int i=0;i<array.length;i++){
            array[i]= (int) stack.pop();
        }
        return array;
    }
}
