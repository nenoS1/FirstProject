import java.util.Scanner;

public class integerOperations {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());
        result = (num1+num2)/num3*num4;

        System.out.println(result);
    }
}
