import java.util.*;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] charcount = scanner.nextLine().toCharArray();

        TreeMap<Character, Integer> counts = new TreeMap<>();

        for (char c : charcount) {
            if (c != ' ') {
                if (!counts.containsKey(c)) {
                    counts.put(c, 0);
                }
                counts.put(c, counts.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : counts.entrySet()) {
            System.out.printf("%c -> %s%n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
        }
    }
}
