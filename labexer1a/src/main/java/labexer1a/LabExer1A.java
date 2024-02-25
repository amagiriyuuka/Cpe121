package labexer1a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabExer1A {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your favorite number: ");
        int favoriteNumber = Integer.parseInt(reader.readLine());

        System.out.print("Enter your favorite cartoon or anime character: ");
        String favoriteCartChar = reader.readLine();

        System.out.print("Enter your first name: ");
        String firstName = reader.readLine();

        System.out.print("Enter your middle initial: ");
        char mi = reader.readLine().charAt(0);

        System.out.print("Enter your last name: ");
        String lastName = reader.readLine();

        System.out.println(favoriteNumber + " is my favorite number.");
        System.out.println("I love " + favoriteCartChar + "!");
        System.out.println("My name is " + capitalizeName(firstName) + " " + mi + ". " + capitalizeName(lastName) + ".");
        System.out.println("You can call me " + createNickname(firstName) + ".");
    }

    public static String capitalizeName(String name) {
        StringBuilder sb = new StringBuilder();
        boolean firstLetter = true;
        for (char c : name.toCharArray()) {
            if (firstLetter) {
                sb.append(Character.toUpperCase(c));
                firstLetter = false;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String createNickname(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
