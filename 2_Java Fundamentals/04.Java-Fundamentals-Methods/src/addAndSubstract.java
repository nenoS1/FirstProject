import java.util.Scanner;

public class addAndSubstract {

    //int result = 0;

    static int add(int number1, int number2){
        int result = number1+number2;
        return result;
    }

    static int substract(int result, int number3){

        return result-number3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());
        int input3 = Integer.parseInt(scanner.nextLine());
        int result = add(input1, input2);

        //System.out.println(add(input1, input2));
        System.out.println(substract(result, input3));
    }
}
