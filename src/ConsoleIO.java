import java.util.Scanner;


public class ConsoleIO {
    public static void main(String[] args) {
        String name = "codeup";
        System.out.println("Prints in a new line");
        System.out.print("Prints on the same line");
        System.out.printf("Hello there, %s. Nice to see you.%n", name);
        // %s = string

        // sc.next(); take input to save it for next use
        // Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        // explain the syntax of %.2f%n
        // %f = float
        // %.2f = float with 2 decimal places
        // %n = new line

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        System.out.printf("The value of pi is approximately %.2f%n", pi);
        System.out.println("Enter an integer: ");
        int userInput = scan.nextInt();

        // explain the syntax of %d%n
        // %d = integer
        // %n = new line

        System.out.printf("You entered %d%n", userInput);
        System.out.println("Enter 3 words: ");
        String firstWord = scan.next();
        String secondWord = scan.next();
        String thirdWord = scan.next();
        System.out.printf("Your 3 words were: %s%n%s%n%s%n", firstWord, secondWord, thirdWord);
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();

        System.out.println("Please enter the width, and length of your room.");
        String width = scan.nextLine();
        String length = scan.nextLine();
        int area = Integer.parseInt(width) * Integer.parseInt(length);
        int perimeter = (Integer.parseInt(width) * 2) + (Integer.parseInt(length) * 2);
        System.out.printf("The area of your room is %d%n", area);
    }
}
