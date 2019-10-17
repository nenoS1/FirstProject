import java.util.Scanner;

public class palindromeIntegers {

    //101, 100, 55, 1001, END

    static void checkPalindrom(String arr){

        String str = arr;
        int length = str.length();
        String rev = "";
        for ( int i = length - 1; i >= 0; i-- ) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev))
            System.out.println("true");
        else
            System.out.println("false");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();


        while(w != "END"){
            if(w.equals("END")){
                break;
            }
            checkPalindrom(w);
            w = scanner.next();

            }


        }



    }

