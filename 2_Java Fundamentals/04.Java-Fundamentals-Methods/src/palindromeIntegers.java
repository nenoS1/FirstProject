import java.util.Scanner;

public class palindromeIntegers {

    //101, 100, 55, 1001, END

    static boolean checkPalindrome(String word){
        int n = word.length();
        String[] number = new String[n];
        number = word.split("");

        for (int i = 0; i < n; i++) {
            String currentstring = number[0];
            for (int j = 0; j < number.length-1; j++) {
                number[j] = number[j+1];
            }
            number[number.length-1] = currentstring;
        }
        //System.out.println(String.join("", number));
        String palString = String.join("", number);

        //if(currentString = palString){ return true; }
        if (word.equals("END")){
            return false;
        } else if (word.equals(palString)){
            System.out.println("true");
        } else {System.out.println("false");
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        checkPalindrome(scanner.nextLine());

    }
}
