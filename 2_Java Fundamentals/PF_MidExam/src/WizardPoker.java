import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WizardPoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(":");
        List<String> cards = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            cards.add(input[i]);
        }

        List<String> newCards = new ArrayList<>();

        List<String> finalCards = new ArrayList<>();

        String line;

        while (!"Ready".equals(line = scanner.nextLine())) {
            String tokens[] = line.split("\\s+");
            String operations = tokens[0];
            String cardName1 = tokens[1];
            if (operations.equals("Add")) {
                addCard(newCards, cards, cardName1);
            } else if (operations.equals("Insert")) {
                int index = Integer.parseInt(tokens[2]);
                if (cards.contains(cardName1) && (index >= 0 && index <= newCards.size()-1)) {
                    //newCards.set(index,cardName1);
                    newCards.add(index, cardName1);
                } else {
                    System.out.println("Error!");
                }
            } else if (operations.equals("Remove")) {
                remove(newCards, cardName1);
            } else if (operations.equals("Swap")) {
                String cardName2 = tokens[2];
                int index1 = newCards.indexOf(cardName2);
                newCards.set(newCards.indexOf(cardName1), cardName2);
                newCards.set(index1, cardName1);
            } else if (operations.equals("Shuffle")) {
                for (int i = newCards.size() - 1; i >= 0; i--) {
                    finalCards.add(newCards.get(i));
                }
            }
        }


        //System.out.println(String.join(" ", newCards));
        if (finalCards.size() > 1) {
            System.out.println(String.join(" ", finalCards));
        } else {
            System.out.println(String.join(" ", newCards));
        }

    }


    public static void remove(List<String> newCards, String cardName1) {
        if (newCards.contains(cardName1)) {
            newCards.remove(cardName1);
        } else {
            System.out.println("Card not found.");
        }
    }


    public static void addCard(List<String> newCards, List<String> cards, String cardName1) {
        if (cards.contains(cardName1)) {
            newCards.add(cardName1);
        } else {
            System.out.println("Card not found.");
        }
    }
}
