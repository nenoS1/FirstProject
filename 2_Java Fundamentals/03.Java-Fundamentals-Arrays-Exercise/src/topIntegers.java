import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];

        for (int i = 0; i < result.length; i++) {
            result[i]=Integer.parseInt(input[i]);
        }

        for (int i = 0; i < result.length-1; i++) {
            boolean isBegger = true;
            int cuurentnumber = result[i];
            for (int j = i+1; j < result.length; j++) {
                int number = result[j];
                if(cuurentnumber <= number){
                    isBegger = false;
                }
            }
            if(isBegger){
                System.out.print(cuurentnumber + " ");
            }
        }
        System.out.println(result[result.length-1]);
    }
}
