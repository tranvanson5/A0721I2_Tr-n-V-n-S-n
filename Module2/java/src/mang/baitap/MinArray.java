package mang.baitap;

import java.sql.Array;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " : ");
            a[i] = scanner.nextInt();
        }
        int min = a[0];
        for (int i : a) {
            if (i <= min) {
                min = i;
            }
        }
        System.out.println("Min: " + min);
    }
}
