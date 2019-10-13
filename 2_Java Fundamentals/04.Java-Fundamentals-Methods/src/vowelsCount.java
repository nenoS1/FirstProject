import java.util.Scanner;

public class vowelsCount {

    static void printVowelsCount(String input){
        String[] vowels = {"a", "e", "i", "o", "u"};
        String s = input;
        String[] word = s.split("");
        int count = 0;

        for (String word1  : vowels) {
            for (String word2 : word) {
                if(word1.equals(word2)){
                    count += 1;
                }
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        printVowelsCount(text);

    }
}
