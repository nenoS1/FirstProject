import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] wagon = new int[n];
        int sum = 0;

        for (int i = 0; i < wagon.length; i++) {
            wagon[i] = scanner.nextInt();
        }

        for (int i = 0; i <= wagon.length-1; i+=1) {
            if (i < wagon.length-1){System.out.printf("%d ", wagon[i]);
            }
            else {
                System.out.printf("%d%n", wagon[i]);
            }
            sum += wagon[i];
        }
        System.out.println(sum);

    }
}
