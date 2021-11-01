package Stack_Queue.baitap.demsolamxuathien;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String str = scan.nextLine();

        int[] count = new int[26];

        char[] ch = str.toCharArray();

        for(int i = 0 ; i < ch.length ; i++) {
            int number = (int)ch[i];
            /* Chuyển kí tự hoa sang thường */
            if(number >= 65 && number <= 90) {
                number += 32;
                ch[i] = (char)number;
            }

            /* Đếm kí tự thường có trong chuỗi */
            if(number >= 97 && number <= 122) {
                /* Tuaa -> a = 97 -> count[97-97] = count[0]++ -> count = */
                count[number - 97]++;
            }
        }

        for(int i = 0 ; i < count.length ; i++) {
            if(count[i] != 0 && count[i] < 26) {
                System.out.println("Kí tự " + (char)(i + 97) + " số lần xuất hiện: " + count[i]);
            }
        }
    }
}
