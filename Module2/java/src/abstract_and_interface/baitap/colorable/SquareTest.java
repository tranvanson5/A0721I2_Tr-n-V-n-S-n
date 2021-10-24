package abstract_and_interface.baitap.colorable;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Random random=new Random();
        Square square []=new Square[4];
        square[0]= new Square(2.0 );
        square[1]= new Square(3.0);
        square[2]= new Square(4.0);
        square[3]= new Square(5.0);
        int x=0;
        for (Square i:square) {
            i.colorable();
            System.out.println("\nShape "+(++x)+"\n"+ i);
        }
    }
}
