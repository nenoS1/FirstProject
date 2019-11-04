import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String train = scanner.nextLine();

        List<String> items = Arrays.stream(train.split(" ")).collect(Collectors.toList());
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < items.size(); i++)
            nums.add(Integer.parseInt(items.get(i)));

        int capacity = Integer.parseInt(scanner.nextLine());
        String line;

        while (!"end".equals(line = scanner.nextLine())){
            String tokens[] = line.split(" ");
            if (tokens[0].equals("Add")){
                int passengers = Integer.parseInt(tokens[1]);
                nums.add(passengers);
            } else {
                int passengers = Integer.parseInt(tokens[0]);

                for (int i = 0; i < nums.size(); i++) {
                    int futureNumber = nums.get(i) + passengers;
                    if (futureNumber <= capacity){
                        nums.set(i, futureNumber);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)+ " ");

        }
    }
}
