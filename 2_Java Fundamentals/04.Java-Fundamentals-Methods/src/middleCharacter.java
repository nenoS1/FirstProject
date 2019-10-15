import java.util.Scanner;

public class middleCharacter {

    //aString
    //1234567
    //1234

    static void getMiddleChar(String input){

        int num1 = input.length()/2;
        char s = input.charAt(num1);
        char s1 = input.charAt(num1-1);
        if(input.length()%2 == 0){
            System.out.print(s1);
            System.out.print(s);
        } else {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        getMiddleChar(input);
    }
}
