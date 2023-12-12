package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public static double getArea(double side) {
        return 4 * side;
    }
    public static double getPerimeter(double side) {
        return (side)*(side);
    }
}
