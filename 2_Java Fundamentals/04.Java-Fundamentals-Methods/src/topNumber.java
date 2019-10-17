import java.util.Scanner;

public class topNumber {

    static void topN(int number){

        for (int i = 0; i < number; i++) {
            if (check8Divisble(i) && checkOneOdd(i)) {
                System.out.println(i);
            }
        }
    }

   //1.2.3.4.5.6.7.8.9.10.11.12.13.14.15.16.17....

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
        while (number != 0) {
            digit = number % 10;
            number /= 10;
        }

        if(digit % 2 != 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        topN(number);

    }
}
