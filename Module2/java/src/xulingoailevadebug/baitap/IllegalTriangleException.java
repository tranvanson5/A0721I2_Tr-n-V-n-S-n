package xulingoailevadebug.baitap;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException() {
    }
    void check(double a, double b, double c) throws IllegalTriangleException {
        if(a+b<=c||b+c<=a||a+c<=b){
            throw  new IllegalTriangleException("Không phải là tam giác");
        } throw new IllegalTriangleException("Là tam giác");
    }
}
