import java.util.Scanner;

public class topNumber {

    static void topN(int number){

        for (int i = 0; i <= number; i++) {
            if (check8Divisble(i) && checkOneOdd(i)) {
                System.out.println(i);
            }
        }
    }

   //1.2.3.4.5.6.7.8.9.10.11.12.13.14.15.16.17....

    static boolean check8Divisble(int number1){
        int sum = 0;

        while (number1 > 0) {
            sum = sum + number1 % 10;
            number1 = number1 / 10;
        }



        if(sum % 8 == 0){
            return true;
        }
        return false;
        }

    static boolean checkOneOdd(int number2){
        int digit = 0;
        while (number2 > 0) {
            digit = number2 % 10;
            number2 /= 10;
        }

        if(digit % 2 != 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());

        topN(number);

    }
}
