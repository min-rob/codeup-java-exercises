public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Integer favoriteNumber = 42;
        String myString = "3.14159";
        System.out.println(myString);
        float myNumber = 123;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree;
//        theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
//  What happens if you assign a value to a numerical variable that is larger (or smaller)
//  than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

        int num = 1923929393;
        num = Integer.MAX_VALUE;
        System.out.println(num);

    }

}
