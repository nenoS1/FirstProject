import java.util.Scanner;

public class zigzagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] first1 = new String[n];
        String[] first2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if(i%2==0){
                first1[i] = input[0];
                first2[i] = input[1];
            } else {
                first1[i] = input[1];
                first2[i] = input[0];
            }
        }
        System.out.println(String.join(" ", first1));
        System.out.println(String.join(" ", first2));
    }
}
