import java.util.Scanner;

public class topNumber {

<<<<<<< HEAD
    static void topN(int number){

        for (int i = 0; i <= number; i++) {
            if (check8Divisble(i) && checkOneOdd(i)) {
                System.out.println(i);
            }
        }
    }

   //1.2.3.4.5.6.7.8.9.10.11.12.13.14.15.16.17....
=======
>>>>>>> remotes/origin/master

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
<<<<<<< HEAD
        while (number2 > 0) {
            digit = number2 % 10;
            number2 /= 10;
=======
        while (number > 0) {
            if ((number % 10) % 2 == 1) {
                digit++;
            }
            number /= 10;
>>>>>>> remotes/origin/master
        }

        if(digit >= 1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());

        for (int i = 0; i < number; i++) {
            if (check8Divisble(i) && checkOneOdd(i)) {
                System.out.println(i);
            }
        }

    }
}
