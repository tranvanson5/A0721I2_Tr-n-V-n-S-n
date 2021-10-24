package abstract_and_interface.baitap.resizeable;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Random random=new Random();
        Square square []=new Square[4];
        square[0]= new Square(2.0 );
        square[1]= new Square(3.0);
        square[2]= new Square(4.0);
        square[3]= new Square(5.0);
        for(int i=0;i<square.length;i++){
            int percent= random.nextInt(100)+1;
            System.out.println("\nShape "+(i+1));
            System.out.println("Before : \n" +square[i]);
            square[i].resize(percent);
            System.out.println("After : \n"+ square[i]);
        }
    }
}
