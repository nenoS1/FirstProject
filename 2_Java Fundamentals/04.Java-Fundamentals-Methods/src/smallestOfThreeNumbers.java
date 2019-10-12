import java.util.Scanner;

public class smallestOfThreeNumbers {

    static void printSmallestNumber(int a, int b, int c){
            if(a>=c && b>=c){
                System.out.print(c);
            } else if (a>=b && c>=b){
                System.out.print(b);
            } else if (b>=a && c>=a){
                System.out.print(a);
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputa = Integer.parseInt(scanner.nextLine());
        int inputb = Integer.parseInt(scanner.nextLine());
        int inputc = Integer.parseInt(scanner.next());

        printSmallestNumber(inputa, inputb, inputc);

    }
}
