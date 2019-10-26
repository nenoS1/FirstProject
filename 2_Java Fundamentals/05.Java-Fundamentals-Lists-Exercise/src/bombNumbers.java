import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers {

    static void detonate(List<Integer> l, int bomb, int power) {
        List<Integer> listToRemove = new ArrayList<>();
        //check equalSum1
        for (int i = 0; i < ; i++) {
            
        }
        l.removeAll(listToRemove);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String line = scanner.nextLine();

        String[] tokens = line.split(" ");
        int input1 =Integer.parseInt(tokens[0]);
        int input2 =Integer.parseInt(tokens[1]);


        List<String> inputStr = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> seqNumbers = new ArrayList<>();
        for (int i = 0; i < inputStr.size(); i++) {
            seqNumbers.add(Integer.parseInt(inputStr.get(i)));
        }

        detonate(seqNumbers, input1, input2);

        for (int i = 0; i < seqNumbers.size(); i++) {
            System.out.print(seqNumbers.get(i)+" ");
        }

        //System.out.printf("%s", tokens[0]);
        //System.out.printf("%s",tokens[1]);

    }
}
