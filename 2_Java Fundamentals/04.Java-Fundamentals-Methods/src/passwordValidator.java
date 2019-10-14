import java.util.Scanner;

public class passwordValidator {

    static void passwordChecker(String password){
        if (checkLength(password)&&
                checkLettersAndDigits(password)&&
                check2Digits(password)){
            System.out.print("Password is valid");
        }

        if(!checkLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if(!checkLettersAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }

        if(!check2Digits(password)){
            System.out.println("Password must have at least 2 digits");
        }

    }

   private static boolean checkLength(String password){
        return password.length()>= 6 && password.length() <= 10;
    }

    static boolean checkLettersAndDigits(String password){
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isDiggit = Character.isDigit(symbol);
            boolean isLetter = Character.isLetter(symbol);

            if(!isDiggit&&!isLetter){
                return false;
            }
        }
        return true;
    }

    static boolean check2Digits(String password){
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if(Character.isDigit(symbol)){
                count++;
            }
        }
        if(count>=2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        passwordChecker(input);
    }
}
