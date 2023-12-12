import java.util.Arrays;

public class Person {
    public String name;
    public int age;
    //constructor
    public Person(String name) {
        this.name = name;
//        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + ", I am " + this.age + " years old.");
    }
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        person1.sayHello();
        person2.sayHello();
    }

//Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.Ω¸

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
        newPeopleArray[newPeopleArray.length - 1] = person;
        return newPeopleArray;
    }

}
