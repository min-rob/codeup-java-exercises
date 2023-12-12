public class JavaMethods {
//    public static void main(String[] args) {
//        String myFirstName = "Rob";
//        String myLastName = "Owens";
//        String fullName = (putNamesTogether(myFirstName, myLastName));
//        System.out.println(fullName);
//    }
//    public static String putNamesTogether(String firstName, String lastName) {
//        String fullName;
//        fullName = firstName + " " + lastName;
//        return fullName;
//    }
    public static void main(String[] args) {
        String myFirstName = "Rob";
        String myLastName = "Owens";
        printName(myFirstName, myLastName);
        printName(myFirstName);
    }
    public static void printName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
    public static void printName(String firstName) {
        System.out.println(firstName);
    }
}
