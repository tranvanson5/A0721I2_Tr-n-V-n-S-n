package mang.baitap;

public class InsertArray {
    public static void main(String[] args) {
        int size = 10; // Suc chua cua mang
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5; // So luong phan tu trong mang hien tai

        System.out.print("Truoc khi xoa: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        int vt = 5;
        int ins = 10;
        n = insert(arr, n, vt, ins);

        System.out.print("\nSau khi xoa : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    static int insert(int[] arr, int n, int vt, int ins) {
        // Xoa phan tu
        for (int i = n; i > vt; i--) {
            arr[i] = arr[i - 1];
        }
        arr[vt] = ins;
        return n;
    }
}