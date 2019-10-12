import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int magicSum = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[input.length];
        boolean flag = false;
        int divider = 0;

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int randomSum = 0;

            for (int j = i+1; j < numbers.length; j++) {
                int number = numbers[j];
                randomSum = currentNumber+number;

                if (randomSum == magicSum) {
                        System.out.printf("%d %d%n", currentNumber, number);

                }
                }
            }
        }
    }
