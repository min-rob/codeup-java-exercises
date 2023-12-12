public class Recursion {
    //req for a recursive solution
    //1) answer is expressed in SMALLER terms of itself
    //2) answer has an escape clause, i.e., a way to STOP calling itself
    public static int factorial(int n)
    {
        if (n == 0) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

}
