package abstract_and_interface.baitap.resizeable;

public class Square extends Shape implements IResizeable{
    private double width = 1.0;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return Math.pow(width,2);
    }

    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public String toString() {
        return "A Square with width="
                + getWidth()
                + ", which is a subclass of "
                + super.toString()
                +", area = "
                +getArea()
                +", perimeter = "
                +getPerimeter();
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + ((this.width * percent) / 100);
    }
}
