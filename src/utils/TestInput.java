package utils;

public class TestInput {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a number: ");
        int userInt = input.getInt();
        System.out.println("You entered: " + userInt);

        System.out.println("Please enter yes or no: ");
        boolean userBoolean = input.yesNo();
        System.out.println("You entered: " + userBoolean);

        System.out.println("Please enter a number between 1 and 10: ");
        int userIntRange = input.getInt(1, 10);
        System.out.println("You entered: " + userIntRange);

        System.out.println("Please enter a double between 1 and 10: ");
        double userDoubleRange = input.getDouble(1, 10);
        System.out.println("You entered: " + userDoubleRange);
    }
}
