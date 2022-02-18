import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class Login {
    public static HashMap<String, String> makeUsersHashtable(String filename) {
        HashMap<String, String> userPasswords = new HashMap<String, String>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String username = line.split(" ")[0];
                String password = line.split(" ")[1];
                userPasswords.put(username, password);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return userPasswords;
    }

    public static void main(String[] args) {
        HashMap<String, String> userPasswords = makeUsersHashtable("users.txt");
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please enter your username");
            String username = in.nextLine();
            System.out.println("Please enter your password");
            String password = in.nextLine();
            if (userPasswords.getOrDefault(username, "").equals(password)) {
                System.out.println("Logged in successfully");
            } else {
                System.out.println("Wrong username or password");
            }
        }

    }
}
