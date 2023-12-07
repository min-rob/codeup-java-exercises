public class Strings {
    public static void main(String[] args) {
        String message = "Hello";
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.charAt(0));
        System.out.println(message.charAt(4));
        System.out.println(message.length());
        System.out.println(message.substring(0, 2));
        System.out.println(message.substring(2, 5));
        System.out.println(message.contains("Hel"));
        System.out.println(message.contains("hel"));
        System.out.println(message.isEmpty());
        System.out.println(message.equals("Hello"));
        System.out.println(message.equals("hello"));
        System.out.println(message.equalsIgnoreCase("hello"));
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("l"));
        System.out.println(message.lastIndexOf("l"));
        System.out.println(message.lastIndexOf("o"));
        System.out.println(message.replace("H", "h"));
        System.out.println(message.replace("l", "L"));
        System.out.println(message);
        System.out.println(message.trim());
        System.out.println(message);
        System.out.println(message.startsWith("He"));
        System.out.println(message.startsWith("he"));
        System.out.println(message.endsWith("lo"));
        System.out.println(message.endsWith("Lo"));
        System.out.println(message);
        System.out.println(message.concat(" World!"));
        System.out.println(message);
        System.out.println(message.toUpperCase().trim().startsWith("HEL"));
        System.out.println(message);
        String s = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
        System.out.println(s.equalsIgnoreCase(s3));
        String s4 = new String("Hello");
        System.out.println(s == s4);
        System.out.println(s.equals(s4));
        System.out.println(s.equalsIgnoreCase(s4));
        System.out.println(s4);
        System.out.println(s4.trim());
        System.out.println(s4);
        System.out.println(s4.replace("H", "h"));
        System.out.println(s4);
        System.out.println(s4.toUpperCase());
        System.out.println(s4);
        System.out.println(s4.toLowerCase());
        System.out.println(s4);
        System.out.println(s4.substring(2));
        System.out.println(s4);
        System.out.println(s4.substring(2, 4));
        System.out.println(s4);
    }
}