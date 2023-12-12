package shapes;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }
    public static double getArea(double width, double length) {
        return length * width;
    }
    public static double getPerimeter(double width, double length){
        return (2 * length) + (2 * width);
    }

}
