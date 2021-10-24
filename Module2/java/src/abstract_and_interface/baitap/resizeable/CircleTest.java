package abstract_and_interface.baitap.resizeable;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random random=new Random();
        Circle circle []=new Circle[4];
        circle[0]= new Circle(2.0);
        circle[1]= new Circle(3.0);
        circle[2]= new Circle(4.0);
        circle[3]= new Circle(5.0);
        for(int i=0;i<circle.length;i++){
            int percent= random.nextInt(100)+1;
            System.out.println("\nShape "+(i+1));
            System.out.println("Before : \n" +circle[i]);
            circle[i].resize(percent);
            System.out.println("After : \n"+ circle[i]);
        }
    }
}
