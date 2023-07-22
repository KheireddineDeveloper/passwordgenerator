import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        PasswordGeneratorGui passwordGeneratorGui = new PasswordGeneratorGui();

    }

    public static String generatePassword() {
        Random random = new Random();

        String charactersForPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"§$%&/()=?`´²³{[]}\\+*~#'-_.:,;@€<>|^°";

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char randomChar = charactersForPassword.charAt(random.nextInt(charactersForPassword.length()));
            passwordBuilder.append(randomChar);
        }
        String password = passwordBuilder.toString();

        return password;
    }

    public static String generatePasswordWithoutUpperCase() {
        Random random = new Random();

        String charactersForPassword = "abcdefghijklmnopqrstuvwxyz0123456789!\"§$%&/()=?`´²³{[]}\\+*~#'-_.:,;@€<>|^°";

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char randomChar = charactersForPassword.charAt(random.nextInt(charactersForPassword.length()));
            passwordBuilder.append(randomChar);
        }
        String password = passwordBuilder.toString();

        return password;
    }

    public static String generatePasswordWithoutLowerCase() {
        Random random = new Random();

        String charactersForPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"§$%&/()=?`´²³{[]}\\+*~#'-_.:,;@€<>|^°";

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char randomChar = charactersForPassword.charAt(random.nextInt(charactersForPassword.length()));
            passwordBuilder.append(randomChar);
        }
        String password = passwordBuilder.toString();

        return password;
    }

    public static String generatePasswordWithoutNumbers() {
        Random random = new Random();

        String charactersForPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!\"§$%&/()=?`´²³{[]}\\+*~#'-_.:,;@€<>|^°";

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char randomChar = charactersForPassword.charAt(random.nextInt(charactersForPassword.length()));
            passwordBuilder.append(randomChar);
        }
        String password = passwordBuilder.toString();

        return password;
    }

    public static String generatePasswordWithoutSpecialCharacters() {
        Random random = new Random();

        String charactersForPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char randomChar = charactersForPassword.charAt(random.nextInt(charactersForPassword.length()));
            passwordBuilder.append(randomChar);
        }
        String password = passwordBuilder.toString();

        return password;
    }

}