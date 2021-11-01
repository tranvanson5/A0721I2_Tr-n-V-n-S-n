package Stack_Queue.baitap.daomangStack;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
        Reversse reversse= new Reversse();
        System.out.println(Arrays.toString(reversse.Reversse(array)));
    }
}
