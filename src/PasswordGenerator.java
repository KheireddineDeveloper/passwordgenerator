import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        PasswordGeneratorGui passwordGeneratorGui = new PasswordGeneratorGui();
    }

    public static void generatePassword() {
        Random random = new Random();

        String charactersForPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*()-_=+[{]};:',<.>/?";

        for (int i = 0; i < 10; i++) {
            String password = String.valueOf((charactersForPassword.charAt(random.nextInt(charactersForPassword.length()))));
            System.out.print(password);




        }
    }
}