import java.util.Scanner;

public class charactersInRange {

    static void printCharactersInRange(char symbol1, char symbol2) {
        int n = Math.abs((int) symbol2 - (int) symbol1 - 1);
        int d = 0;
        char[] range = new char[n];

        if ((int) symbol2 > (int) symbol1) {
            for (char i = (char) (symbol1 + 1); i < symbol2; i++) {
                range[d++] = i;
                System.out.printf("%c ", i);
            }
        } else {
            for (char i = (char) (symbol2 + 1); i < symbol1; i++) {
                range[d++] = i;
                System.out.printf("%c ", i);
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input1 = scanner.next().charAt(0);
        char input2 = scanner.next().charAt(0);

        printCharactersInRange(input1, input2);
    }
}
