import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
* 1 2 3 4 5 5 5 6
Delete 5
end
*
*
* */

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chList = scanner.nextLine();

        List<String> items = Arrays.stream(chList.split(" ")).collect(Collectors.toList());
        List<Integer> Elements = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            Elements.add(Integer.parseInt(items.get(i)));
        }

        String line;

        while (!"end".equals(line = scanner.nextLine())) {
            String tokens[] = line.split("\\s+");
            if (tokens[0].equals("Delete")) {
                int elements = Integer.parseInt(tokens[1]);
                for (int i = 0; i < Elements.size(); i++) {
                    int currentElement = Elements.get(i);
                    if (currentElement == elements) {
                        Elements.remove(i);
                    }
                /*while (Elements.contains(elements)){
                    Elements.remove(elements);
                    break;
                }
                 */
                }
            }
             else if (tokens[0].equals("Insert")){
                int elements = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);
                if (position>=0 && position<Elements.size()){
                    Elements.add(position,elements);
                }
            }


        }
        for (int i = 0; i < Elements.size(); i++) {
            System.out.print(Elements.get(i) + " ");
        }
    }
}
