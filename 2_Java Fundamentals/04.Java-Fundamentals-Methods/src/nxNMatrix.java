import java.util.Scanner;

public class nxNMatrix {

    static void printRows(int number){
        for (int i = 0; i < number; i++) {
                System.out.printf("%d ", number);
            }
        System.out.println();
        }

        static void printMatrix(int number){
            for (int i = 0; i < number; i++) {
                printRows(number);
            }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printMatrix(number);
    }
}
