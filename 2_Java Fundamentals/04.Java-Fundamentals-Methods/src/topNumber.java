import java.util.Scanner;

public class topNumber {


    static boolean check8Divisble(int number){
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }



        if(sum % 8 == 0){
            return true;
        }
        return false;
        }

    static boolean checkOneOdd(int number){
        int digit = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 1) {
                digit++;
            }
            number /= 10;
        }

        if(digit >= 1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            if (check8Divisble(i) && checkOneOdd(i)) {
                System.out.println(i);
            }
        }

    }
}
