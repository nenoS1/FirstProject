import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        //1 2 3 3

        for (int i = 0; i < numbers.length; i++) {
                //boolean isSumequal = true;
                int currentnumber = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                leftSum += numbers[j];
            }
            for (int j = i-1; j < numbers.length-1; j--) {
                rightSum+=numbers[j];
            }
         if(rightSum==leftSum){
             System.out.println(i);
         }
        }
    }
}
