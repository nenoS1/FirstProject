import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersLine1 = scanner.nextLine();
        String numbersLine2 = scanner.nextLine();
        String[] numberString1 = numbersLine1.split(" ");
        String[] numberString2 = numbersLine2.split(" ");

        for (String word1  : numberString1) {
            for (String word2 : numberString2) {
                if(word1.equals(word2)){
                    System.out.print(word1 + " ");
                }
            }
        }

        }
    }
