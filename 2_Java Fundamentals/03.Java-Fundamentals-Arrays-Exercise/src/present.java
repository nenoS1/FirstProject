import java.util.Scanner;

public class present {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfNumbers = scanner.nextInt();
        int[] numbers = new int[countOfNumbers];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
