package abstract_and_interface.baitap.resizeable;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Random random=new Random();
        Rectangle rectangle []=new Rectangle[4];
        rectangle[0]= new Rectangle(2.0,3.0);
        rectangle[1]= new Rectangle(3.0,4.0);
        rectangle[2]= new Rectangle(4.0,5.0);
        rectangle[3]= new Rectangle(5.0,6.0);
        for(int i=0;i<rectangle.length;i++){
            int percent= random.nextInt(100)+1;
            System.out.println("\nShape "+(i+1));
            System.out.println("Before : \n" +rectangle[i]);
            rectangle[i].resize(percent);
            System.out.println("After : \n"+ rectangle[i]);
        }
    }
}
