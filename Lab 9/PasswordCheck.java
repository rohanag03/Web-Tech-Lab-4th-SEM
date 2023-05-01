import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your password: ");
        String password = input.nextLine();

        if (validatePassword(password)) {
            System.out.println("Your password is valid");
        } else {
            System.out.println("Your password is invalid");
        }

    }

    public static boolean validatePassword(String password) {
    
        int length = password.length();

        if (length < 6) 
            return false;

        int count = 0;

        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }

            else if (!Character.isUpperCase(c))
                return false;
        }

        return count >= 3;

    }

}