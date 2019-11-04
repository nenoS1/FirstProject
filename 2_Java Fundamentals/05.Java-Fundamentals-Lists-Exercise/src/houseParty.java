import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listSize = Integer.parseInt(scanner.nextLine());

        List<String> partyNames = new ArrayList<>();


        for (int i = 0; i < listSize; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ", 2);
            if(tokens[1].equals("is going!") && !partyNames.contains(tokens[0])){
                partyNames.add(tokens[0]);
            } else if(tokens[1].equals("is going!") && partyNames.contains(tokens[0])){
                System.out.println(tokens[0]+" is already in the list!");
            }

            else if (tokens[1].equals("is not going!") && partyNames.contains(tokens[0])){
                partyNames.remove(tokens[0]);
            } else if(tokens[1].equals("is not going!") && !partyNames.contains(tokens[0])){
                System.out.println(tokens[0]+" is not in the list!");
            }
        }


        for (int i = 0; i < partyNames.size(); i++) {
            System.out.println(partyNames.get(i)+" ");
        }
    }
}
