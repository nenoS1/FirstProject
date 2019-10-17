import java.util.Scanner;

public class factorialDivision {


    //5*4*3*2*1
    static void factorialDiv(double number1, double number2){
        double fD1 = 1.0;
        double fD2 = 1.0;
        double fdFinal = 0.0;

        for (int i = 1; i <= number1; i++) {
            fD1 = fD1* i;
        }

        for (int k = 1; k <= number2; k++) {
            fD2 = fD2*k;
        }

        fdFinal = fD1/fD2;
        System.out.printf("%.2f", fdFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input1 = Integer.parseInt(scanner.nextLine());
        double input2 = Integer.parseInt(scanner.nextLine());

        factorialDiv(input1, input2);
    }
}
