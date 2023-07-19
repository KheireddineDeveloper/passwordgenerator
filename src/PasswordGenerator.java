import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        PasswordGeneratorGui passwordGeneratorGui = new PasswordGeneratorGui();

    }

    public static String generatePassword() {
        Random random = new Random();

        String charactersForPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*()-_=+[{]};:',<.>/?";

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char randomChar = charactersForPassword.charAt(random.nextInt(charactersForPassword.length()));
            passwordBuilder.append(randomChar);
        }
        String password = passwordBuilder.toString();

        return password;
    }
}