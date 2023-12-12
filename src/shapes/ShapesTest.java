package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4.0 , 5.0);
        Square box2 = new Square(5.0);
        System.out.println(Rectangle.getPerimeter(4, 5));
        System.out.println(Rectangle.getArea(4,5));
        System.out.println(Square.getArea(5));
        System.out.println(Square.getPerimeter(5));
    }
}
