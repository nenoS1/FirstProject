import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        System.out.println(sum);
    }
}
