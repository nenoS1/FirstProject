import java.util.Scanner;

public class testBooleanMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());

        isOdd(value);
    }

    public static boolean isOdd (int number) {
        return (number % 2) != 0;
    }
}
