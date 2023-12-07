import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //    Loop Basics
        //
        //    While
        //
        //    Create an integer variable i with a value of 5.
        //    Create a while loop that runs so long as i is less than or equal to 15
        //    Each loop iteration, output the current value of i, then increment i by one.
//        int i = 5;
//        while(i <= 15) {
//            System.out.println("i is: " + i);
//            i++;
//        }
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        long num = 0;
//        do {
//            num += 2;
//            System.out.println("num is: " + num );
//        } while (num != 100); {
//            System.out.println("reached 100: " + num );
//        }

// Alter your loop to count backwards by 5's from 100 to -10.
//            long num = 100;
//            do {
//                num -= 5;
//                System.out.println("counting backwards, num is: " + num );
//            } while (num != -10); {
//                System.out.println("reached the limit of " + num );
//            }

//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long num = 2;
//        do {
//            System.out.println(num * num);
//            num *= 2;
//        } while (num < 1000000); {
//            System.out.println("Reached the max" + num);
//        }
//FIZZBUZZ
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for(int num = 1; num < 100; num ++) {
//            if(num % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            if(num % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            if(num % 3 == 0 && num % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            }
//        }

//Display a table of powers.
//
//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.
//        String userContinue = "";
        Scanner sc = new Scanner(System.in);
//        do {
//            userContinue = "y";
//
//
//            System.out.println("What number would you like to go up to?");
//            int userInt = sc.nextInt();
//
//            char verticalLine = '|';
//            String horizontalLine = "-";
//
//            System.out.println("number" + verticalLine + "squared" + verticalLine + "cubed");
//            System.out.println(horizontalLine.repeat(20));
//
//
//            for (int i = 1; i <= userInt; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%3d   " + verticalLine + "%3d   " + verticalLine + "%3d   \n", i, (squared), cubed);
//            }
//
//
//            System.out.println("Would you like to continue?");
//            userContinue = sc.next();
//
//        }while (userContinue.equalsIgnoreCase("y"));

        String userContinue;

        do {
            System.out.println("Enter a grade from 0 to 100");
            int userGrade = sc.nextInt();



            userContinue = "y";
            if (userGrade > 100 || userGrade < 0) {
                System.out.println("Grade not in range");
            }
            else if (userGrade >= 88 && userGrade <= 100){
                System.out.println("A");
            }else if (userGrade >= 80){
                System.out.println("B");
            }else if (userGrade >= 67){
                System.out.println("C");
            }else if (userGrade >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Would you like to continue");
            userContinue = sc.next();

        }while (userContinue.equalsIgnoreCase("y"));


    }
}
