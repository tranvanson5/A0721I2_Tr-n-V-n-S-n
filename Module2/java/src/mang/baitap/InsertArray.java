package mang.baitap;
import java.util.Arrays;
public class InsertArray {
    static int[] insert(int[] a, int vt, int number){
        vt=vt-1;
        int arr[]=new int[a.length+1];
        if(vt<0||vt> arr.length-1){
            System.out.println("Lỗi");
        } else{
            for (int i=0;i<vt;i++){
                arr[i] = a[i];
            }
            arr[vt]=number;
            for (int i=vt+1;i< arr.length;i++){
                arr[i] = a[i-1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(Arrays.toString(insert(a,6,100)));
    }
}