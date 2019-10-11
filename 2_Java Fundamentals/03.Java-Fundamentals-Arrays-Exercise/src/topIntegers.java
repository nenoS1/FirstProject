import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];

        for (int i = 0; i < result.length; i++) {
            result[i]=Integer.parseInt(input[i]);
        }



    }
}
