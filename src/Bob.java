import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//He answers 'Whatever.' to anything else.
//Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you have to say to Bob");
        String userInput = sc.nextLine();
        if(userInput.endsWith("?")) {
            String bobReply = "Sure";
            System.out.println(bobReply);
//            System.out.println("Do you want to continue this conversation with Bob? (y/n)");
        } else if (userInput.endsWith("!")) {
            String bobReply2 = "Whoa, chill out!";
            System.out.println(bobReply2);
//            System.out.println("Do you want to continue this conversation with Bob? (y/n)");
        } else if (userInput.isEmpty()) {
            String bobReply3 = "Fine. Be that way!";
            System.out.println(bobReply3);
//            System.out.println("Do you want to continue this conversation with Bob? (y/n)");
        } else {
            String bobReply4 = "whatever";
            System.out.println(bobReply4);
//            System.out.println("Do you want to continue this conversation with Bob? (y/n)");
        }
    }
}
