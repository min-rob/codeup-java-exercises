package shapes;

import utils.Input;

public class testCircle {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a radius: ");
        double userDouble = input.getDouble();
        Circle circle = new Circle(userDouble);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circumference of the circle is: " + circle.getCircumference());

    }
}
