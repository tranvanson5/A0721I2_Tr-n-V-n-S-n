package mang.baitap;

public class MaxMang2Chieu {
    public static void main(String[] args) {
        int[][] a = { { 9, 2, 3, 4, 5 }, { 6, 5, 7, 3, 2 } };
        int max = 0;
        for (int[] is : a) {
            for (int i : is) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println(max);
    }
}
