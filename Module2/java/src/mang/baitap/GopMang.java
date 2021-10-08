package mang.baitap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 6, 7, 8, 9, 10 };
        int length = a.length + b.length;
        int[] result = new int[length];
        int pos = 0;
        for (int element : a) {
            result[pos] = element;
            pos++;
        }
        for (int element : b) {
            result[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
}
