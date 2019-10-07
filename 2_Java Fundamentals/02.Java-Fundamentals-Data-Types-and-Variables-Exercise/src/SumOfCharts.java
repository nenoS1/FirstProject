import java.util.Scanner;

public class SumOfCharts {
    public static void main(String[] args) {
        int totalSum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char c = scanner.next().trim().charAt(0);;
            totalSum = totalSum + (int) c;
        }

        System.out.printf("The sum equals: " + totalSum);
    }
}
