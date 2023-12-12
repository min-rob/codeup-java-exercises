import java.util.Random;

public class ServerNameGenerator {

    static String[] nouns = {"Book", "Car", "Tree", "Computer", "Dog", "Ocean", "Guitar", "Camera", "Lamp", "Shoes"};
    static String[] adjectives = {"Vibrant", "Sleek", "Majestic", "Cozy", "Radiant", "Enigmatic", "Serene", "Spacious", "Lively", "Elegant"};

    public static void main(String[] args) {
        int randomAdjectiveIndex = (int) (Math.random() * adjectives.length);
        int randomNounIndex = (int) (Math.random() * nouns.length);

        // Get random adjective and noun
        String randomAdjective = adjectives[randomAdjectiveIndex];
        String randomNoun = nouns[randomNounIndex];

        // Combine adjective and noun with a hyphen
        String newName = randomAdjective + "-" + randomNoun;
        System.out.println("Generated Name: " + newName);
    }
}
