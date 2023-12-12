import java.util.Arrays;
public class ArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Jane");
        people[2] = new Person("Jill");
//        for (Person person : people) {
//            System.out.println(person.name);
//        }

        Person[] newPeople = Person.addPerson(people, new Person("Joon"));
        for (Person person : newPeople) {
            System.out.println(person.name);
        }
    }
}
